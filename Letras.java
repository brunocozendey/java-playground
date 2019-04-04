import java.io.*;

public class Letras{
    
    public static void main ( String [] args) throws Exception { 
        String line; 
        //line = inData.readline();
        int location;
        char letter;
        int index;
        int[] letterCount = new int[26];
        BufferedReader inData;
        inData = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite palavras e vazio para parar:");
        line = inData.readLine();
        
        while (!line.isEmpty()){
            for (location = 0; location <line.length(); location++){
                letter = line.charAt(location);
                if ((letter >= 'A' && letter <= 'Z') || (letter<='a' && letter <= 'z')){
                    index = ((int)Character.toUpperCase(letter)-(int)'A');
                    System.out.println(index);
                    letterCount[index] = letterCount[index]+1;
                }
            }
            line = inData.readLine();
        }
        for (index = 0; index <letterCount.length; index++){
            System.out.println("The total number of " + (char)(index + (int)'A')+"'s is "+letterCount[index]);
        }
    }
}
