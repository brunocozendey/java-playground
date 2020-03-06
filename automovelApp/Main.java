import java.io.*;

public class Main
{
    private Automoveis carro1;
    private Motorista motorista1, motorista2;
        
    public static void main(String[] args)
    {   
        Automoveis carro1 = new Automoveis("Chevette", 87);
        Motorista motorista1 = new Motorista("João", carro1);
        Motorista motorista2 = new Motorista("Pedro",carro1);

        System.out.println(motorista1.obterNome());
        System.out.println(motorista2.obterNome());
    }
}