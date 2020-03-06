import java.io.*;

public class LerEscreverArquivo { 
  public static void main(String[] args) { 
    char c;
    try{
        FileWriter writer = new FileWriter("output.txt");
        FileReader reader = new FileReader("input.txt");
        int next;
    
        while ((next = reader.read()) != -1){
            c = (char) next;
            System.out.print(c);
            writer.write(c);

        } 
        reader.close();
        writer.close();

    }
    
    catch(Exception e)
    {
        System.out.println("Erro: Erro na leitura de entrada. \nExcecao: "+e);
    }
    
  } 
}