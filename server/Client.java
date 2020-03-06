import java.io.*;
import java.net.*;

public class Client
{
    public Client(){
        try{
                Socket s = new Socket("127.0.0.1",5155);
                InputStream in = s.getInputStream();
                BufferedReader bin = new BufferedReader(new InputStreamReader(in));
                System.out.println(bin.readLine());
                s.close();
        }
        catch (IOException e){
            System.out.println(e);
            System.exit(1);
        }
    }
    public static void main(String args[]){
        Client client = new Client();
    }

}