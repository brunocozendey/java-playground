import java.io.*;
public class Main{
    public static void main(String[] args)
    {
        Mulher mulher = new Mulher();
        Homem homem = new Homem();
        public int n;
        String tipo;

        try
        {
            System.out.println("Quantas pessoas serão calculados o IMC");
            n = Integer.parseInt(inData.readLine()); 
            System.out.println("A entrada é referente a Homem (H) ou Mulher (M)");
            tipo = inData.readLine();

            if ((tipo.String.toUpperCase() == 'H') || (tipo == 'h'))
            {

            }
            else
            {

            }


        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: A quantidade de angulo deve ser um numero inteiro. \nExcecao: "+e);
        }
        catch(IOException e)
        {
            System.out.println("Erro: Erro na leitura de entrada. \nExcecao: "+e);
        }
    }
    
}