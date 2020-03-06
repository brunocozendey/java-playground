public class FucionarioContratado extends Funcionario{
    int dependentes;
    float salario_familia;
    final float valorPorDep = 9.58f;
    final double aliquotaIR = 0.15;
    Funcionario func = new Funcionario();
    
    public void FucionarioContratado(String n, String c, float s, int d){
        func.Funcionario(n,c,s);
        dependentes = d;
    }

    public void CalculaSalario(){
        func.salario_liq = super.CalculaSalario(aliquotaIR); 
        //Usa o Super pois esta reescrevendo o metodo da classe pai, ambas tem o mesmo nome
    }

    public void CalculaSalario(int numeroDependentes){
        func.salario_base = func.salario_base + (numeroDependentes*valorPorDep);
        this.CalculaSalario();
    }

    public String toString()
    {
        return "Nome: "+func.nome+"\nCodigo: "+func.cod+"\nSalario base: "+func.salario_base+"\nSalario Liquido: "+func.salario_liq;
    }

    public String getNome(){
        return func.nome;
    }

    public String getCod(){
        return func.cod;
    }

    public double getSalario_liq(){
        return func.salario_liq;
    }
    public float getSalario_base(){
        return func.salario_base;
    }
    public float getDep(){
        FucionarioContratado fc = new FucionarioContratado();
        return fc.dependentes;
    }
}