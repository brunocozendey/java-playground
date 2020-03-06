package lp2g07.biblioteca;
class LivroNaoCadastradoEx extends Exception
{
    public LivroNaoCadastradoEx() {
        super("O cod do livro procurado nao existe, o livro nao foi cadastrado.");    
    }
    
}