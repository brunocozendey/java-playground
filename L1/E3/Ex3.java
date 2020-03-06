import java.io.*;

public class Ex3{
    public static void main(String[] args)
    {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        double ang;
        //AnguloObj angulo = new AnguloObj();
        //angulo.AnguloObj(90);
        //System.out.println(angulo.toString());
        try
        {
            System.out.println("Digite o número de angulos: ");
            n = Integer.parseInt(inData.readLine()); 
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: A quantidade de angulo deve ser um numero inteiro. \nExcecao: "+e);
        }
        catch(IOException e)
        {
            System.out.println("Erro: Erro na leitura de entrada. \nExcecao: "+e);
        }

        try
        {   
            if (n>0){
                AnguloObj[] v_ang = new AnguloObj[n];
                for (int i=0; i<n; i++)
                {   
                    System.out.println("Digite a medida em graus do "+(i+1)+"o angulo: ");
                    ang = Double.parseDouble(inData.readLine());
                    v_ang[i] = new AnguloObj();
                    v_ang[i].AnguloObj(ang);
                }
                System.out.println("========== RESULTADO ==========");
                for (int i=0; i<n; i++)
                {   
                    System.out.println(v_ang[i].toString());
                }
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: Numero de entrada nao e real. \nExcecao: "+e);
        }

        catch(IOException e)
        {
            System.out.println("Erro: Entre com o numero corretamente. \nExcecao: "+e);
        }
        catch (Exception e) {
            System.out.println("Erro Geral:\n Excecao: "+e);
        }
    }

}