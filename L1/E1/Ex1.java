public class Ex1
{
    public static void main(String[] args)
    {
        CalculaArea area = new CalculaArea();
        TipoTriangulo triangulo = new TipoTriangulo();
        try
        {
            //System.out.println(args.length);
            for (int i=0;i<args.length;i++)
            {
                if (Float.parseFloat(args[i]) <= 0 )
                {
                    ErrZero erroZero = new ErrZero();
                    throw erroZero;
                }            
            }

            switch(args.length)
            {
                case 0:
                    ErrMenosArg erroMenos = new ErrMenosArg();
                    throw erroMenos;    
                    //break;
                case 1:
                    //area.calcula(Float.parseFloat(args[0]));
                    System.out.printf("A area do circulo e: %.2f unidades de area.\n",area.calcula(Float.parseFloat(args[0])));
                    break;
                case 2:
                    //area.calcula(Float.parseFloat(args[0]),Float.parseFloat(args[1]));    
                    System.out.printf("A area do retangulo e: %.2f unidades de area.\n",area.calcula(Float.parseFloat(args[0]),Float.parseFloat(args[1])));
                    break;
                case 3:
                    //area.calcula(Float.parseFloat(args[0]),Float.parseFloat(args[1]),Float.parseFloat(args[2]));
                    System.out.printf("A area do triangulo e: %.2f unidades de area.\n",area.calcula(Float.parseFloat(args[0]),Float.parseFloat(args[1]),Float.parseFloat(args[2])));
                    System.out.println("O tipo de triangulo e: "+triangulo.tipo(Float.parseFloat(args[0]),Float.parseFloat(args[1]),Float.parseFloat(args[2])));
                    break;
                default:
                    ErrMaisArg erroMais = new ErrMaisArg();
                    throw erroMais; 
                    //break;
            
            }
        }
        
        catch (ErrZero e)
        {
            System.out.println("Erro: o argumento não pode ser zero. \n Excecao: "+e);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Erro: o elemento nao e um numero real. \nExcecao: "+e);
        }
        catch (ErrMenosArg e)
        {
            System.out.println("Erro: a quantidade de argumentos e menor que a necessaria\nExcecao: "+e);
        }
        catch (ErrMaisArg e)
        {
            System.out.println("Erro: a quantidade de argumentos e maior que a necessaria\nExcecao: "+e);
        }
        catch (ErrNaoTriangulo e)
        {
            System.out.println("Erro: o valor dos catetos nao e valido.\nExcecao: "+e);
        }
        catch (Exception e)
        {
            System.out.println("Erro Geral:\nExcecao: "+e);
        }             
    }


}
