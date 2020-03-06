import lp2g07.biblioteca.*;
import java.io.*;
import java.util.*;   
import java.text.*;

public class E2{
    public static void main(String[] args){
        Biblioteca b = null;
        String usuariosArq, livrosArq;
        System.out.println("Iniciando ...");
        int codUsu = 0;
        
        
        /*Usuario u1 = new Usuario("Rua Alvaro Ramos 45",codUsu++);
        Usuario u2 = new Usuario("Rua Pacheco Leao 70",codUsu++);
        Usuario u3 = new Usuario("Rua Alice 278",codUsu++);


        Livro l1 = new Livro("Navegar e preciso.");     
        Livro l2 = new Livro("O Mercado de Acoes em 25 Episodios.");
        Livro l3 = new Livro("Em Busca do Infinito.");
        
        System.out.println(l1.getTit()+"\n"+u1.getEnd());
        
          
        b.cadastraLivro(l1);
        System.out.println(b.imprimeLivros());
        b.salvaArquivo("Teste2","Teste2");
        System.out.println("Foi..");
        */
        
        Scanner ler = new Scanner(System.in);
        while (true) {
            System.out.println("1. Manutencao");
            System.out.println("2. Cadastro");
            System.out.println("3. Emprestimo");
            System.out.println("4. Relatorio");
            System.out.println("Ou FIM para Sair");
            System.out.print("Digite sua opcao: ");
            String menu = ler.nextLine();                
                switch (menu) {
                    case "1":
                        while (true){
                            System.out.println("1. Criar arquivo.");
                            System.out.println("2. Abrir arquivo.");
                            System.out.println("3. Salvar arquivo.");
                            System.out.println("Ou VOLTAR, para voltar ao menu anterior.");
                            System.out.print("Digite sua opcao: ");
                            String menu2 = ler.nextLine();
                            switch(menu2){
                                case "1":
                                    b = new Biblioteca();
                                    b.salvarCadastro(b.getCadastroUsuario(),"BD_usuario.dat");
                                    b.salvarCadastro(b.getCadastroLivro(),"BD_livro.dat");
                                    System.out.println("Arquivo Criado!");
                                    /*System.out.println("Digite o nome do arquivo usuario.");
                                    usuariosArq = ler.nextLine();
                                    System.out.println("Digite o nome do arquivo livros.");
                                    livrosArq = ler.nextLine();*/
                                    //b.salvaArquivo(usuariosArq,livrosArq);
                                    break;
                                case "2":
                                    System.out.println("Digite o nome do arquivo usuario.");
                                    usuariosArq = ler.nextLine();
                                    System.out.println("Digite o nome do arquivo livros.");
                                    livrosArq = ler.nextLine();
                                    b = new Biblioteca(usuariosArq,livrosArq);
                                    break;
                                case "3":
                                    if (b != null){
                                        b.salvarCadastro(b.getCadastroUsuario(), "BD_usuario.dat");
                                        b.salvarCadastro(b.getCadastroLivro(), "BD_livro.dat");
                                    }
                                    else{
                                        System.out.println("Primeiro carregue ou crie uma biblioteca.");
                                    }
                                    break;
                                default:
                                    break;    
                            }

                            if (menu2.equalsIgnoreCase("VOLTAR"))
                                break;
                        }
                        break;
                    case "2":
                        while (true){
                            System.out.println("1. Cadastrar usuarios");
                            System.out.println("2. Cadastrar livro");
                            System.out.println("3. Salvar arquivo.");
                            System.out.println("Ou VOLTAR, para voltar ao menu anterior.");
                            System.out.print("Digite sua opcao: ");
                            String menu2 = ler.nextLine();
                            switch(menu2){
                                case "1":
                                    System.out.println("Digite o nome usuario.");
                                    String nome = ler.nextLine();
                                    
                                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                    GregorianCalendar cal = new GregorianCalendar();
                                    Date d;
                                    while (true){
                                        System.out.println("Digite a data de nascimento");
                                        String dataNasc = ler.nextLine();
                                        try{
                                            //Date date = df.parse(dataNasc);
                                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                            d = sdf.parse(dataNasc);
                                            cal.setTime(d);
                                            break;
                                        }
                                        catch(Exception e){
                                            System.out.println("Nao e uma data valida. Erro:"+e);
                                        }
                                    }                               
                                    System.out.println("Digite o endereco.");
                                    String end = ler.nextLine(); //b.salvaArquivo(usuariosArq,livrosArq);
                                    Usuario u = new Usuario(end,codUsu++);
                                    u.setDataNasc(cal);
                                    u.setNome(nome);
                                    //System.out.println(u.toString());
                                    break;
                                case "2":
                                    System.out.println("Digite o nome do livro.");
                                    String nomeLivro = ler.nextLine();
                                    //b.lerArquivo(usuariosArq,livrosArq);
                                    Livro l = new Livro(nomeLivro);
                                    break;
                                case "3":
                                    while (true){
                                        System.out.println("1. Salvar Usuarios");
                                        System.out.println("2. Salvar Livros.");
                                        System.out.println("Ou VOLTAR, para voltar ao menu anterior.");
                                        System.out.print("Digite sua opcao: ");
                                        String menu3 = ler.nextLine();
                                        switch(menu3){
                                            case "1":    
                                                break;
                                            case "2":
                                                break;
                                        }
                                        if (menu3.equalsIgnoreCase("VOLTAR"))
                                            break;

                                    }
                                    //b.salvaArquivo(usuariosArq,livrosArq);
                                    break;
                                default:
                                    break;    
                            }

                            if (menu2.equalsIgnoreCase("VOLTAR"))
                                break;
                        }
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    default:
                        break;
                }
            if (menu.equalsIgnoreCase("FIM"))
               break;
        }
        /*
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
       try{     
            String menu ="";
            String menu2 ="";
            while (!(menu.equals("1")||menu.equals("2"))) {
            //while (!menu.equals("2")){ 
                System.out.println("1. Manutencao");
                System.out.println("2. Cadastro");
                System.out.println("3. Emprestimo");
                System.out.println("4. Relatorio");
                System.out.println("Ou qualquer coisa para Sair");
                System.out.print("Digite sua opcao: ");
                menu = inData.readLine();
            }
            
            switch (menu) {
                case "1":
                
                    break;
                case "2":
                    MyList.Ordena(2);
                    break;
                case "3":
                    MyList.Ordena(3);
                    break;
                case "4":
                    MyList.Ordena(4);
                    break;
                default:
                    System.exit(-1)
                    break;
            }
          */  
            /*if (menu.equals("1")){
                while (!(menu2.equals("1")||menu2.equals("2")||menu2.equals("3")||menu2.equals("4")||menu2.equals("5"))){
                    System.out.println("Escolha seu modo de ordenacao:");
                    System.out.println("1.Alfabetica (A-Z)");
                    System.out.println("2.Alfabetica (Z-A)");
                    System.out.println("3.Menor Peso");
                    System.out.println("4.Maior Altura");
                    System.out.println("5.Menor IMC");
                    System.out.print("Digite sua opcao: ");
                    menu2 = inData.readLine();
                    switch (menu) {
                        case "1":
                            MyList.Ordena(1);                 
                            break;
                        case "2":
                            MyList.Ordena(2);
                            break;
                        case "3":
                            MyList.Ordena(3);
                            break;
                        case "4":
                            MyList.Ordena(4);
                            break;
                        case "5":
                            MyList.Ordena(5);
                            break;    
                        default:
                            break;
                    }
                    MyList.Ordena(Integer.parseInt(menu2));
                }
                for(int i=0;i<MyList.ListaSize();i++){
                    System.out.println(MyList.PessoaIMCget(i).toString());
                }
            }
            else if(menu.equals("2")) System.exit(-1);
        */  
        /*  
        }
        
        catch(NumberFormatException e)
        {
            System.out.println("Erro: A quantidade de angulo deve ser um numero inteiro. \nExcecao: "+e);
        }
        catch (NullPointerException ex) {
            System.out.println("Numero de funcionarios nao existente.");
        }
        catch(IOException e)
        {
            System.out.println("Erro: Erro na leitura de entrada. \nExcecao: "+e);
        }
        */
    }

}