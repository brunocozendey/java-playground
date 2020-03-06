public class Automoveis
{
    public String modelo;
    public int ano;
    private boolean ligado;

    //Instanciar automovel
    public Automoveis(String m, int a){
        modelo = m;
        ano = a;
        ligado = false;
    }

    //Ligar automovel
    public void liga()
    {
        ligado = true;
    }

    public void desliga()
    {
        ligado = false;
    }

    public void displayMessage(String s)
    {
        System.out.println(s);
    }
}