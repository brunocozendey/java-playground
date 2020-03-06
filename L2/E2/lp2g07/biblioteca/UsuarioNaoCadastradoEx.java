package lp2g07.biblioteca;
class UsuarioNaoCadastradoEx extends Exception
{
    public UsuarioNaoCadastradoEx() {
        super("O cod do usuario procurado nao existe, o usuario ainda nao foi cadastrado.");    
    }
    
}