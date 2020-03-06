public class Mulher extends PessoaIMC
{
    private double imc;
    private double a,p;
    public String resultIMC()
    {
        //imc = getIMC();
        //double imc = super.calculaIMC(super.getAltura(),super.getPeso());

        a = super.getAltura();
        p = super.getPeso();

        imc = super.calculaIMC(a,p);

        if (imc < 19){
            return "Abaixo do peso atual.";
        }
        else if ((imc >= 19)&&(imc<=25.8)){
            return "Peso ideal.";
        }
        else {
            return "Acima do peso ideal.";
        }

    }

    /*public double getIMC()
    {
        a = super.getAltura();
        p = super.getPeso();
        return p/(a*a);
    }*/

    public String toString(){
        return super.toString()+"\n"+this.resultIMC()+"\n";
    }
}