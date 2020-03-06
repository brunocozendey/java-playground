import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;


public class LerBuffer{
    public static void main(String[] args){
        
        try{
            //FileReader reader = new FileReader("input.txt");
            //BufferedReader in = new BufferedReader(reader);

            JFileChooser chooser = new JFileChooser();
            FileReader arq = null;
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
            File selectedFile = chooser.getSelectedFile();
            arq = new FileReader(selectedFile);
            }
            
            BufferedReader in = new BufferedReader(arq);

            String inputLine = in.readLine();
            System.out.println(inputLine);
            double x = Double.parseDouble(inputLine);
            arq.close(); 
        }
        catch(NumberFormatException e){
            System.out.println("Nao e um double, nao e um double..: " + e);
        }
        catch(Exception e){
            System.out.println("Errooou: " + e);
        }
    }
}