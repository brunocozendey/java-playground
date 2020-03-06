public abstract class PessoaIMC extends Pessoa
{
    protected double peso,altura;

    /*void PessoaIMC(String n, String d, double p, double a){
        nome = n;
        dataNascimento = d;
        peso =p;
        altura = a;
    }*/
     
    public double getPeso()
    {
        return peso;
    }

    public double getAltura()
    {
        return altura;
    }

    public double calculaIMC( double a, double p)
    {
        return p/(a*a);
    }

    public abstract String resultIMC(); 

    public String toString()
    {
        return super.toString()+"\nPeso: "+peso+"\nAltura: "+altura;
    }
}