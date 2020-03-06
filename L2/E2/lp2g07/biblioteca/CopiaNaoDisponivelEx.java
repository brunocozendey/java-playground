package lp2g07.biblioteca;
public class CopiaNaoDisponivelEx extends Exception{
    public CopiaNaoDisponivelEx(){
        super("Nao ha mais copias disponiveis desse exemplar.");
    }
}
