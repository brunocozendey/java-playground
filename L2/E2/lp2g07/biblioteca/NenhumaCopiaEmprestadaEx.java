package lp2g07.biblioteca;

public class NenhumaCopiaEmprestadaEx extends Exception
{
    public NenhumaCopiaEmprestadaEx(){
        super("Nao ha nenhuma copia desse exemplar que tenha sido emprestada.");
    }
}