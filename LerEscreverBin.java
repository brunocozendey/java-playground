import java.io.*;

public class LerEscreverBin { 
  public static void main(String[] args) { 
    
    int next; 
    byte b;

    try{
        FileInputStream inputStream = new FileInputStream("input.dat");
        FileOutputStream outputStream = new FileOutputStream("output.dat");
        while ( (next = inputStream.read()) != -1){
            b = (byte) next;
            char c = (char) next;
            outputStream.write(b);
            System.out.print(c);
        }
        System.out.print('\n');
        inputStream.close();
        outputStream.close();
    }
    catch(FileNotFoundException e){
        System.out.println("Arquivo não encontrado. Erro: "+e);
    }
    catch(Exception e){
        System.out.println("Erro: "+e);
    }
  }

}