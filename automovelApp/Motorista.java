public class Motorista
{
    private String nome;
    private Automoveis carro;

    //Instanciar motorista
    public Motorista(String n, Automoveis a)
    {
        nome = n;
        carro = a;
    }

    //Obter nome do motorista
    public String obterNome()
    {
        return nome;
    }
    public Automoveis obterCarro()
    {
        return carro;
    }

}