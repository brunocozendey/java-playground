import java.io.*;
import java.net.*;

public class Connection extends Thread
{
    public Connection(Socket s){
        outputLine = s;
    }

    public void run(){
        try{
            PrintWriter pout = new PrintWriter(outputLine.getOutputStream(),true);

            pout.println("The Date and Time is"+new java.util.Date().toString());

            outputLine.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    private Socket outputLine;

}