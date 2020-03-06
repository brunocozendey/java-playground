package lp2g07.biblioteca;
import java.util.GregorianCalendar;

class Pessoa
{
    protected String nome;
    GregorianCalendar dataNasc;

    public void Pessoa(String n, GregorianCalendar d){
        nome = n;
        dataNasc = d;
    }

    public String toString(){
        return "Nome: "+nome+"\nData de Nascimento: "+dataNasc;
        
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }

    public void setDataNasc(GregorianCalendar d){
        dataNasc = d;
    }
}