import java.io.*;

public class Ex2
{
    public static void main(String[] args) throws IOException
    {
        //Angulo ang = new Angulo();
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        String angulo;

        try
        {
            if (args.length > 0)
            {
                //System.out.printf("Angulo em radianos: %.2f\n",ang.converteAngulo(Float.parseFloat(args[0])));
                System.out.printf("Seno: %.2f\n",Angulo.funcaoSeno(Float.parseFloat(args[0])));
                System.out.printf("Coseno: %.2f\n",Angulo.funcaoCoseno(Float.parseFloat(args[0])));
                System.out.printf("Tangente: %.2f\n",Angulo.funcaoTangente(Float.parseFloat(args[0])));
                System.out.printf("Cotangente: %.2f\n",Angulo.funcaoCotangente(Float.parseFloat(args[0])));
                System.out.println("");
                
                System.out.println("Digite uma medida em graus do angulo: ");
                angulo = inData.readLine();
            }
            else
            {
                System.out.println("Digite uma medida em graus do angulo: ");
                angulo = inData.readLine();
            }                
            while (!angulo.equals(""))
            {
                //System.out.println(angulo);
                System.out.printf("Seno: %.2f\n",Angulo.funcaoSeno(Float.parseFloat(angulo)));
                System.out.printf("Coseno: %.2f\n",Angulo.funcaoCoseno(Float.parseFloat(angulo)));
                System.out.printf("Tangente: %.2f\n",Angulo.funcaoTangente(Float.parseFloat(angulo)));
                System.out.printf("Cotangente: %.2f\n",Angulo.funcaoCotangente(Float.parseFloat(angulo)));
                System.out.println("");
                
                System.out.println("Digite uma medida em graus do angulo: ");
                angulo = inData.readLine();     
            }
        }
  /*      
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
        */
        catch (NumberFormatException e)
        {
            System.out.println("Erro: o elemento nao e um numero real. \nExcecao: "+e);
        }
        
        catch(IOException e) 
        {
            System.out.println("Erro E/S:\nExcecao: "+e);
        }             
        
    }


}
