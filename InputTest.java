import java.io.*;

public class InputTest
{
    public static void main (String[] args){
        BufferedReader inData;
        inData = new BufferedReader(new InputStreamReader(System.in));
        String nome;
        System.out.println("Digite seu nome: ");
        try
        {
            nome = inData.readLine();
            System.out.println("Seu nome: " + nome);
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }

        
    }
}