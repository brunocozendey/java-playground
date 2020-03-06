public class ForExemplo
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int soma, i;

        //Inicialização;condição;incremento
        for(i=0,soma=0; i<=n; i++)
        {
            System.out.print("Soma = "+soma+" + "+i);
            soma+=i;
            System.out.println(" = "+soma+"\n");
        }
    }

}