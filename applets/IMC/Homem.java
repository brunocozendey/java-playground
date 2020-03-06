public class Homem extends PessoaIMC 
{
    
    private double imc;
    private double a,p;
    
    public String resultIMC()
    {
        a = super.getAltura();
        p = super.getPeso();

        imc = super.calculaIMC(a,p);
        //imc = getIMC();
        if (imc < 20.7){
            return "Abaixo do peso atual.";
        }
        else if ((imc >= 20.7) && (imc <= 26.4)){
            return "Peso ideal.";
        }
        else {
            return "Acima do peso ideal.";
        }
    }


    public String toString(){
        return super.toString()+"\n"+this.resultIMC()+"\n";
    }
}