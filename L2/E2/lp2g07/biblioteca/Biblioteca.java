package lp2g07.biblioteca;
import java.util.*;
import java.io.*;


public class Biblioteca implements Serializable
{
    Hashtable<Integer, Usuario> cadastroUsuario;
    Hashtable<String, Livro> cadastroLivro;

    public Biblioteca(){
        cadastroUsuario = new  Hashtable<Integer, Usuario>();
        cadastroLivro = new  Hashtable<String, Livro>();
    }
    
    public Biblioteca(String usu, String liv){
       cadastroUsuario = new  Hashtable<Integer, Usuario>();
       cadastroLivro = new  Hashtable<String, Livro>();
       cadastroUsuario = carregarCadastoUsuario(usu);
       cadastroLivro = carregarCadastoLivro(liv);
    }
    
    public void cadastraUsuario(Usuario u){
        cadastroUsuario.put(u.getCod(),u);
    }

    public void cadastraLivro(Livro l){
        cadastroLivro.put(l.getCod(),l);
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

    public static void salvarCadastro(Hashtable cadastro,String nome_arquivo){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(nome_arquivo));
            outStream.writeObject(cadastro);
            outStream.close();
        }
        catch(IOException ex){
            System.out.println("Arquivo nao encontrado. Erro: "+ex);
        }
    }

    public static Hashtable carregarCadastoUsuario(String nome_arquivo){
        Hashtable<Integer, Usuario> cadastroU = new Hashtable<Integer, Usuario>();
        try{
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nome_arquivo));
           cadastroU = (Hashtable<Integer, Usuario>) inputStream.readObject();
           inputStream.close();
        }
        catch(ClassNotFoundException ex){
            System.out.println("Classe nao encontrada. Erro: "+ex);
        }
        catch(IOException ex){
            System.out.println("Arquivo nao encontrado. Erro: "+ex);
        }
        return cadastroU;
    }
    public static Hashtable carregarCadastoLivro(String nome_arquivo){
        Hashtable<String, Livro> cadastroL = new Hashtable<String, Livro>();
        try{
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("BD_"+nome_arquivo+".dat"));
           cadastroL = (Hashtable<String, Livro>) inputStream.readObject();
           inputStream.close();
        }
        catch(ClassNotFoundException ex){
            System.out.println("Classe nao encontrada. Erro: "+ex);
        }
        catch(IOException ex){
            System.out.println("Arquivo nao encontrado. Erro: "+ex);
        }
        return cadastroL;
    }
}