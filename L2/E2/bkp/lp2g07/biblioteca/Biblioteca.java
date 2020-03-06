package lp2g07.biblioteca;
import java.util.*;
import java.io.*;


public class Biblioteca
{
    Hashtable<Integer, Usuario> cadastroUsuario;
    Hashtable<String, Livro> cadastroLivro;

    public Biblioteca(){
        //Hashtable<Integer, Usuario> cadastroUsuario = new  Hashtable<Integer, Usuario>();
        //Hashtable<String, Livro> cadastroLivro = new  Hashtable<String, Livro>();
        cadastroUsuario = new  Hashtable<Integer, Usuario>();
        cadastroLivro = new  Hashtable<String, Livro>();
    }
    
    /*public Biblioteca(String usu, String liv){
        Hashtable<Integer, Usuario> cadastroUsuario = new  Hashtable<Integer, Usuario>();
        Hashtable<String, Livro> cadastroLivro = new  Hashtable<String, Livro>();
        try{
            FileOutputStream usuarioFile = new FileOutputStream(usu+"cadastro_usuario.dat");
            ObjectOutputStream usuarioOut = new ObjectOutputStream(usuarioFile);

            usuarioOut.writeObject(cadastroUsuario);
            usuarioOut.close();
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo. Erro:"+e);
        }
        
        try{
            FileOutputStream livroFile = new FileOutputStream(liv+"cadastro_livros.dat");
            ObjectOutputStream livroOut = new ObjectOutputStream(livroFile);
            
            livroOut.writeObject(cadastroLivro);
            livroOut.close();
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo. Erro:"+e);
        }*/

        public Biblioteca(String usu, String liv){
            cadastroUsuario = new  Hashtable<Integer, Usuario>();
            cadastroLivro = new  Hashtable<String, Livro>();
            try{
                FileInputStream arquivoUsu = new FileInputStream(usu);
                ObjectInputStream objArquivoUsu = new ObjectInputStream(arquivoUsu);
                cadastroUsuario = (Hashtable) objArquivoUsu.readObject();
                    
                FileInputStream arquivoLiv = new FileInputStream(liv);
                ObjectInputStream objArquivoLiv = new ObjectInputStream(arquivoLiv);
                cadastroLivro = (Hashtable) objArquivoLiv.readObject();

                objArquivoUsu.close();
                objArquivoLiv.close();
            }
            catch(ClassNotFoundException e) {
                System.out.println("Classe não encontrada. Erro:"+e);
            }
            catch(IOException e) {
                System.out.println("Erro ao gravar o arquivo. Erro:"+e);
            }   
        }

    public void cadastraUsuario(Usuario u){
        cadastroUsuario.put(u.getCod(),u);
    }

    public void cadastraLivro(Livro l){
        cadastroLivro.put(l.getCod(),l);
    }

    public void salvaArquivo(Hashtable ht, String nomeArq){
        try{
            FileOutputStream arquivo = new FileOutputStream(nomeArq);
            ObjectOutputStream objArquivo = new ObjectOutputStream(arquivo);
            
            objArquivo.writeObject(ht);
            objArquivo.close();
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo. Erro:"+e);
        }   
    }

    public void leArquivo(String nomeArq){
        try{
            FileInputStream arquivo = new FileInputStream(nomeArq);
            ObjectInputStream objArquivo = new ObjectInputStream(arquivo);
            Hashtable ht = (Hashtable) objArquivo.readObject();
                
            /*if (objArquivo instanceof Hashtable<Integer, Usuario>){
                int idu = objArquivo.readInt();
                Usuario u = (Usuario) objArquivo.readObject();
            }

            else if (objArquivo instanceof Hashtable<String, Livro>){
                String idl = (String) objArquivo.readObject();
                Livro l = (Livro) objArquivo.readObject();
            } 
            */

            objArquivo.close();
        }
        catch(ClassNotFoundException e) {
            System.out.println("Classe não encontrada. Erro:"+e);
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo. Erro:"+e);
        }   
    }

    public void emprestaLivro(Usuario u, Livro l){
        Date d = new Date();
        GregorianCalendar hj = new GregorianCalendar();
        GregorianCalendar devolucao = new GregorianCalendar();
        
        hj.setTime(d);
        devolucao.setTime(d);
        devolucao.set(Calendar.DATE, devolucao.get(Calendar.DATE) + 15); //15 dias apos a data de retirada e a devolucao

        l.empresta();
        u.addLivroHist(hj,devolucao,l.getCod());        
    }

    public void devolveLivro(Usuario u, Livro l){
        Date d = new Date();
        GregorianCalendar hj = new GregorianCalendar();
        GregorianCalendar dev = new GregorianCalendar();
    
        hj.setTime(d);
        dev = l.getDataDev();

        if (dev.before(hj)) System.out.println("Livro atrasado, cobrar multa.");
        l.devolve();
        u.addLivroHist(l.getDataEmp(),hj,l.getCod());
         
    }
    
    public String imprimeLivros(){
        List<String> list = new ArrayList<String>(); // or use map.keys()
        List<Livro> listLivros = new ArrayList<Livro>();
        String key;
        Enumeration nomes;
        String out="";
        
        nomes = cadastroLivro.keys();
        while(nomes.hasMoreElements()) {
            key = (String) nomes.nextElement();
            listLivros.add(cadastroLivro.get(key));
        }
        for (int i=0;i < (listLivros.size());i++){

            list.add((listLivros.get(i)).getTit());
        }

        Collections.sort(list);
        for (int j=0;j < (list.size());j++){
            out += list.get(j)+"\n";
        }
        
        return out;
    }

    public String imprimeUsuarios(){
        List<String> list = new ArrayList<String>(); // or use map.keys()
        List<Usuario> listUsuarios = new ArrayList<Usuario>();
        int key;
        Enumeration nomes;
        String out="";
        
        nomes = cadastroUsuario.keys();
        while(nomes.hasMoreElements()) {
            key = (int) nomes.nextElement();
            listUsuarios.add(cadastroUsuario.get(key));
        }
        for (int i=0;i < (listUsuarios.size());i++){

            list.add((listUsuarios.get(i)).getNome());
        }

        Collections.sort(list);
        for (int j=0;j < (list.size());j++){
            out += list.get(j)+"\n";
        }
        
        return out;
    }

    public Livro getLivro(String cod){
        
        try{
            if (cadastroLivro.get(cod) == null)
            {
                LivroNaoCadastradoEx Erro = new LivroNaoCadastradoEx();
                throw Erro;
            }
            
        }
        catch(LivroNaoCadastradoEx e){
            System.out.println("Erro:"+e);
        }
        return cadastroLivro.get(cod); //Pode ser que ele execute pois esta depois do catch.

    }
    
    public Usuario getUsuario(int cod){
        try{
            if (cadastroUsuario.get(cod) == null)
            {
                UsuarioNaoCadastradoEx Erro = new UsuarioNaoCadastradoEx();
                throw Erro;
            }
            
        }
        catch(UsuarioNaoCadastradoEx e){
            System.out.println("Erro:"+e);
        }   
        return cadastroUsuario.get(cod); 
    }

    public Hashtable getCadastroUsuario(){
        return cadastroUsuario;
    }
    
    public Hashtable getCadastroLivro(){
        return cadastroLivro;
    }

    public void salvaArquivo(String nomeArqUsu,String nomeArqLiv){    
        File arqUsu = new File(nomeArqUsu+"usuarios.dat");
        File arqLiv = new File(nomeArqLiv+"livros.dat");

        try{
            arqUsu.delete();
            arqLiv.delete();
            
            arqUsu.createNewFile();
            arqLiv.createNewFile();

            ObjectOutputStream objOutputUsu = new ObjectOutputStream(new FileOutputStream(arqUsu));
            objOutputUsu.writeObject(imprimeUsuarios());
            objOutputUsu.close();

            //FileOutputStream arquivoLiv = new FileOutputStream(nomeArqLiv);
            //ObjectOutputStream objArquivoLiv = new ObjectOutputStream(arquivoLiv);
            ObjectOutputStream objOutputLiv = new ObjectOutputStream(new FileOutputStream(arqLiv));
            objOutputLiv.writeObject(imprimeLivros());
            objOutputLiv.close();
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo. Erro:"+e);
        }   
    }



}