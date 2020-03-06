public class Automoveis
{
    public String modelo;
    public int ano;
    private boolean ligado;

    //Instanciar automaovel
    public Automovel (String m, int a){
        modelo = m;
        ano = a;
        ligado = false;
    }

    //Ligar automóvel
    public void liga()
    {
        ligado = true;
    }

    public void desliga()
    {
        ligado = false;
    }


}