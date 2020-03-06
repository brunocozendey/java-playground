import java.util.GregorianCalendar;
import java.util.ArrayList; 
import java.io.*;

class Livro2 implements Serializable
{
    String codLiv, titLiv, catLiv;
    int qtd, emp;

    public Livro2(String tit){
        titLiv = tit;
        /*codLiv = new String();
        titLiv = new String();
        catLiv = new String();
        qtd = new int();
        emp = new int();*/
    }

    public void set(String tit){
        titLiv = tit;
        /*codLiv = new String();
        titLiv = new String();
        catLiv = new String();
        qtd = new int();
        emp = new int();*/
    }


    /*public void Livro(){
        this.codLiv = "";
        this.titLiv = "";
        this.catLiv = "";
        this.qtd = 0; //informa a quantidade de livros existentes.
        this.emp = 0; //Informa a quantidade de livro emprestado.
    }*/

    public String getTit(){
        return titLiv;
    }
}