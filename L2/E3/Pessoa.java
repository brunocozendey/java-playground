class Pessoa
{
    protected String nome, dataNascimento;
    public void Pessoa(String n, String d){
        nome = n;
        dataNascimento = d;
    }

    public String toString(){
        return "Nome: "+nome+"\nData de Nascimento: "+dataNascimento;
        
    }
    public String getNome()
    {
        return nome;
    }
    public String getDataNascimento()
    {
        return dataNascimento;
    }
}