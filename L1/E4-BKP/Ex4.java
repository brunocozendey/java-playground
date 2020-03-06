import java.io.*;
//import java.util.ArrayList;
public class Ex4
{

    public BufferedReader inFile;
    public String file = "exemplo.txt";
    public FucionarioContratado[] v_funcContratado;
    //public static ArrayList <FucionarioContratado> listaFuncionarios = new ArrayList<FucionarioContratado>(); 

    public static void main(String[] args) throws FileNotFoundException
    {
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try
        {
            System.out.println("Digite quantos funcionarios foram contratados: ");    
            n = Integer.parseInt(inData.readLine());
            
            Ex4 in = new Ex4(n);

            /*Debug
            Funcionario func = new Funcionario();
            func.Funcionario("Bruno","Emp01",1000);
            System.out.println(func.toString());
            
            FucionarioContratado func_contratado = new FucionarioContratado();
            func_contratado.FucionarioContratado("Bruno2","Emp02",1000,4);
            System.out.println(func_contratado.toString());
            System.out.println(func_contratado.getNome());
            */
        }
        catch(NumberFormatException e)
        {
            System.out.println("Erro: A quantidade de angulo deve ser um numero inteiro. \nExcecao: "+e);
        }
        catch(IOException e)
        {
            System.out.println("Erro: Erro na leitura de entrada. \nExcecao: "+e);
        }
        
    }

    public Ex4(int num_funcionarios) throws FileNotFoundException
    {
        v_funcContratado = new FucionarioContratado[num_funcionarios];
        this.calculaSalarios();
        /*for (int i=0;i<num_funcionarios;i++){
            v_funcContratado[i].this.calculaSalarios();
        }
        */

    }
 
    public void calculaSalarios() throws FileNotFoundException
    {   
        String[][] MData = new String[v_funcContratado.length][4];
        inFile = new BufferedReader(new FileReader(file));        
        try{
            while(inFile.ready()){
                for (int j=0; j<v_funcContratado.length;j++)
                {
                    for (int k=0; k<4;k++)
                    {
                        MData[j][k] = inFile.readLine();
                    }
                }
            } 
            inFile.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Arquivo n�o encontrado.");
        }
        catch (Exception ex) {
            System.out.println("Arquivo n�o encontrado.");
        }

        for (int i=0;i<v_funcContratado.length;i++){
            v_funcContratado[i] = new FucionarioContratado();
            v_funcContratado[i].FucionarioContratado(MData[i][0],MData[i][1],Float.parseFloat(MData[i][2]),Integer.parseInt(MData[i][3]));
            //v_funcContratado[i].FucionarioContratado("MData[i][0]","MData[i][1]",500f,5);
        }

        System.out.println("--- Cadastro de Funcionarios ");
        for (int l=0; l<v_funcContratado.length; l++){
            System.out.println("Nome do Empregado: "+v_funcContratado[l].getNome());    
            System.out.println("Codigo: "+v_funcContratado[l].getCod());
            System.out.println("Salario: "+v_funcContratado[l].getSalario_base());
            System.out.println("Numero de dependentes: "+v_funcContratado[l].getDep());
            System.out.println("\n");
        }
        
        for (int i=0;i<v_funcContratado.length;i++){
            //v_funcContratado[i].CalculaSalario(v_funcContratado[l].getDep());
            v_funcContratado[i].CalculaSalario();
        }

        System.out.println("--- Folha Salarial ");
        for (int l=0; l<v_funcContratado.length; l++){
            System.out.println("Nome do Empregado: "+v_funcContratado[l].getNome());    
            System.out.println("Codigo: "+v_funcContratado[l].getCod());
            System.out.println("Salario-Base: "+v_funcContratado[l].getSalario_base());
            System.out.println("Salario-Liquido: "+v_funcContratado[l].getSalario_liq());
            System.out.println("\n");
        }

        //listaFuncionarios.add("abc");
        //listaFuncionarios.add(new FucionarioContratado("Rubens Andrade","Emp01",500f,0));
        //listaFuncionarios.add(funcContratado.FucionarioContratado("Rubens Andrade","Emp01",500f,0));
        //listaFuncionarios.add(funcContratado.FucionarioContratado("Paulo Ricardo","Emp02",500f,2));
        


    }

}