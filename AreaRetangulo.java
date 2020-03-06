import java.io.*;

public class AreaRetangulo{

    public static void main(String[] args) throws IOException
    {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        double a,b,area;
        System.out.println("Digite um dos lados do triângulo.");
        aux = inData.readLine();
        a = Double.parseDouble(aux);

        System.out.println("Digite o outro lado do triângulo.");
        aux = inData.readLine();
        b = Double.parseDouble(aux);

        area = a*b;
        
        System.out.println("Area do retangulo: " + area);
    }
}