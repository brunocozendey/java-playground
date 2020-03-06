import java.io.*;
public class FuncionarioContratado extends Funcionario{
    int dependentes;
    float salario_familia;
    final float valorPorDep = 9.58f;
    final double aliquotaIR = 15;
    Funcionario func = new Funcionario();
    
    public void FuncionarioContratado(String n, String c, float s, int d){
        func.Funcionario(n,c,s);
        dependentes = d;
    }

    public void CalculaSalario(){
        func.s_liq = func.CalculaSalario(aliquotaIR); 
        //Usa o Super pois esta reescrevendo o metodo da classe pai, ambas tem o mesmo nome
    }

    public void CalculaSalario(int numeroDependentes){
        func.s_base = func.s_base + (numeroDependentes*valorPorDep);
        this.CalculaSalario();
    }

    public String toString()
    {
        return "Nome: "+func.nome+"\nCodigo: "+func.cod+"\nSalario base: "+func.s_base+"\nSalario Liquido: "+func.s_liq;
    }

    public String getNome(){
        return func.nome;
    }

    public String getCod(){
        return func.cod;
    }

    public double getSalario_liq(){
        return func.s_liq;
    }
    public float getSalario_base(){
        return func.s_base;
    }
    public int getDep(){
        return dependentes;
    }
}