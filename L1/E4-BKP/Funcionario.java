public class Funcionario
{
    String nome,cod;
    float salario_base;
    double salario_liq;

    public void Funcionario(String n, String c, float s)
    {
        nome = n;
        cod = c;
        salario_base = s;
        salario_liq = s;
    }

    public double CalculaSalario(double desconto)
    {
        return salario_base*(1-(desconto/100)); 
    }

    public String toString(){
        return "Nome: "+nome+"\nCodigo: "+cod+"\nSalario base: "+salario_base;
    }



}