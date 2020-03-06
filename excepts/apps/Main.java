import br.uerj.ime.lp2.*;

public class Main{
    public static void main(String[] args)
    {
        Calculadora calc = new Calculadora();
        try
        {
            System.out.println(calc.soma(10,12));
            System.out.println(calc.div(10,0));

        }
        catch (Exception e)
        {
            System.out.println("Erro:\nExcecao: "+e);
        }
        
    }

}