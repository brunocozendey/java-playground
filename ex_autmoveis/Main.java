class Main
{
    private Automovel carro1;
    private Motorista motorista1, motorista2;

    public static void main (String[] args)
    {
        carro1 = new Automovel("Chevette", 87);
    
        motorista1 = new Motorista("João", carro1);

        motorista2 = new Motorista("Pedro",carro1);

        System.out.printls(motorista1.obterNome());
        System.out.printls(motorista2.obterNome());
    }
}