class Motorista
{
    private String nome;
    private Automovel carro;

    //Instanciar motorista
    public void motorista (String n, Automovel a)
    {
        nome = n;
        carro = a;
    }

    //Obter nome do motorista
    public String obterNome()
    {
        return nome;
    }
    public Automovel obterCarro()
    {
        return carro;
    }

}