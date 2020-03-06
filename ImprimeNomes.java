// *****************************************************
// Imprime nome em dois formatos diferentes
// *****************************************************

import java.io.*;

public class ImprimeNomes
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader inData;
        String first, last, firstLast,lastFirst;
        
        inData = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o primeiro nome: ");
        first = inData.readLine();
        
        System.out.println("Digite o ultimo nome: ");
        last = inData.readLine();
        
        firstLast = first + " " + last;
        System.out.println("O nome modelo first-last é: " + firstLast);

        lastFirst = last + " " + first;
        System.out.println ("O nome do modelo last-first é: " + lastFirst);
    

    }

}