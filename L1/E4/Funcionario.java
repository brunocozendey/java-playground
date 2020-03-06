public class Funcionario
{
    String nome,cod;
    float salario;
    double s_liq;
    float s_base;

    public void Funcionario(String n, String c, float s)
    {
        nome = n;
        cod = c;
        s_base = s;
        salario = s;
    }

    public double CalculaSalario(double desconto)
    {
        return s_base*(1-(desconto/100)); 
    }

    public String toString(){
        return "Nome: "+nome+"\nCodigo: "+cod+"\nSalario base: "+s_base;
    }



}