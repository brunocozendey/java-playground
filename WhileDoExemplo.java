import java.io.*;
public class WhileDoExemplo
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in;
        in = new BufferedReader (new InputStreamReader(System.in));
        String aux;
        int contador = 0;
        System.out.println("Quantidade de teclas diferentes de A foi pressionada: ");
        do 
        {
            System.out.println("Contador = "+contador);
            System.out.print("Digite uma letra e ENTER: ");
            aux = in.readLine();
            contador++;
        }
        while ( aux.charAt(0) != 'A'); //criterio de parada
    }
}