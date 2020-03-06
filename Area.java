public class Area
{
    public static void main (String[] args)
    {
        //Verifica se foram passados exatamente dois argumentos
        if (args.length == 2){
            double a = Double.parseDouble(args[0]); //Converte um String para um double.
            double b = Double.parseDouble(args[1]);
            double area = a*b;
            System.out.println("Area = "+area); 
        }
        if (args[0] == "-help"){
            System.out.println("Digite o nome do arquivo seguido da largura e comprimento em decimal.");
    
        }
    }
}