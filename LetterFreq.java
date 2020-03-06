import java.io.*;
public class LetterFreq{
    public static void main(String[] args) throws IOException
    {
        BufferedReader dataFile = new BufferedReader(new InputStreamReader(new FileInputStream("texto.txt")));

        String line;
        line = dataFile.readLine();
        int location;
        char letter;
        int index;
        int[] letterCount = new int[26];
        try {
            while (line!= null)
            {
                for (location=0; location < line.length(); location++)
                {
                    letter = line.charAt(location);
                    if ((letter >= 'A' && letter <='Z')||(letter >= 'a' && letter <='z'))
                    {
                        index = ((int) Character.toUpperCase(letter) - (int)('A'));
                        letterCount[index] = letterCount[index]+1;
                    }
                }
                line = dataFile.readLine();
            }
            for (index = 0; index < letterCount.length;index++)
            {
                System.out.println("The total number of "+ (char) (index+ (int) 'A') +"'s is " + letterCount[index]);
            }   
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
        finally
        {
            dataFile.close();
        }
        
        
    }

}