import java.io.*;
import java.net.*;

public class Server
{
    public Server(){
        try{
            s = new ServerSocket(5155);
        }
        catch(IOException e){
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Server is listening...");
        try{
            while(true){
                client = s.accept();
                c = new Connection(client);
                c.start();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
    public static void main(String args[]){
        Server timeOfDayServer = new Server();
    }

    private ServerSocket s;
    private Socket client;
    private Connection c;

}