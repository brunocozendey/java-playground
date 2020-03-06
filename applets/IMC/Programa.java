import java.io.*;
import java.util.*;

public class Programa
{
    public static void main(String[] args){
        MinhaListaOrdenavel MyList = new MinhaListaOrdenavel();
      
        Homem h1 = new Homem();
        Homem h2 = new Homem();
        Homem h3 = new Homem();
        Homem h4 = new Homem();
        Homem h5 = new Homem();
        
        Mulher m1 = new Mulher();      
        Mulher m2 = new Mulher();
        Mulher m3 = new Mulher();
        Mulher m4 = new Mulher();
        Mulher m5 = new Mulher();
      
        h1.nome = "Bruno";
        h1.dataNascimento = "30/01/1990";
        h1.peso = 80.0;
        h1.altura = 1.80;
        MyList.add(h1);

        h2.nome = "Bento";
        h2.dataNascimento = "17/05/1987";
        h2.peso = 90.0;
        h2.altura = 1.70;
        MyList.add(h2);

        h3.nome = "Salir";
        h3.dataNascimento = "12/04/1956";
        h3.peso = 60.0;
        h3.altura = 1.70;
        MyList.add(h3);

       m1.nome = "Gabriela";
       m1.dataNascimento = "21/09/1989";
       m1.peso = 48.0;
       m1.altura = 1.58;
       MyList.add(m1);

       m2.nome = "Lana";
       m2.dataNascimento = "21/09/1937";
       m2.peso = 65.0;
       m2.altura = 1.90;
       MyList.add(m2);

       m3.nome = "Maria";
       m3.dataNascimento = "12/03/1987";
       m3.peso = 50.0;
       m3.altura = 1.90;
       MyList.add(m3);
       
       h4.nome = "Ronaldo";
       h4.dataNascimento = "23/07/1980";
       h4.peso = 78.0;
       h4.altura = 2.00;
       MyList.add(h4);

       m4.nome = "Jussara";
       m4.dataNascimento = "30/05/1967";
       m4.peso = 90.0;
       m4.altura = 1.80;
       MyList.add(m4);

       h5.nome = "Javi";
       h5.dataNascimento = "23/03/1997";
       h5.peso = 90.0;
       h5.altura = 1.90;
       MyList.add(h5);
       
       m5.nome = "Ana";
       m5.dataNascimento = "23/06/1977";
       m5.peso = 50.0;
       m5.altura = 1.50;
       MyList.add(m5);
           
       BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
       try{
            
            String menu ="";
            String menu2 ="";
            while (!(menu.equals("1")||menu.equals("2"))) {
            //while (!menu.equals("2")){ 
                System.out.println("1. Imprimir lista");
                System.out.println("2. Sair");
                System.out.print("Digite sua opcao: ");
                menu = inData.readLine();
            }
            if (menu.equals("1")){
                while (!(menu2.equals("1")||menu2.equals("2")||menu2.equals("3")||menu2.equals("4")||menu2.equals("5"))){
                    System.out.println("Escolha seu modo de ordenacao:");
                    System.out.println("1.Alfabetica (A-Z)");
                    System.out.println("2.Alfabetica (Z-A)");
                    System.out.println("3.Menor Peso");
                    System.out.println("4.Maior Altura");
                    System.out.println("5.Menor IMC");
                    System.out.print("Digite sua opcao: ");
                    menu2 = inData.readLine();
                    /*switch (menu) {
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
                    }*/
                    MyList.Ordena(Integer.parseInt(menu2));
                }
                for(int i=0;i<MyList.ListaSize();i++){
                    System.out.println(MyList.PessoaIMCget(i).toString());
                }
            }
            else if(menu.equals("2")) System.exit(-1);
            
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

       /*

        h1.nome = "C";
        h1.dataNascimento = "23/03/1997";
        h1.peso = 90.0;
        h1.altura = 1.90;
        MyList.add(h1);
        
        m1.nome = "A";
        m1.dataNascimento = "23/06/1977";
        m1.peso = 50.0;
        m1.altura = 1.50;
        MyList.add(m1);

        h2.nome = "F";
        h2.dataNascimento = "23/03/1997";
        h2.peso = 90.0;
        h2.altura = 1.90;
        MyList.add(h2);
        
        m2.nome = "B";
        m2.dataNascimento = "23/06/1977";
        m2.peso = 50.0;
        m2.altura = 1.50;
        MyList.add(m2);

        h3.nome = "D";
        h3.dataNascimento = "23/03/1997";
        h3.peso = 90.0;
        h3.altura = 1.90;
        MyList.add(h3);
        
        m3.nome = "Aa";
        m3.dataNascimento = "23/06/1977";
        m3.peso = 50.0;
        m3.altura = 1.50;
        MyList.add(m3);*/


       

       /*for(int i=0;i<MyList.ListaSize();i++){
           System.out.println(MyList.PessoaIMCget(i).toString());
           System.out.println(MyList.PessoaIMCget(i).calculaIMC((MyList.PessoaIMCget(i)).getAltura(),(MyList.PessoaIMCget(i)).getPeso()));  
           //System.out.println(Math.round((MyList.PessoaIMCget(i).getNome()).compareTo((MyList.PessoaIMCget(i+1).getNome()))));
           //System.out.println(((Mylist.PessoaIMCget(i)).getNome()).compareTo((Mylist.PessoaIMCget(i+1)).getNome()));
        }*/
        
    } 

}