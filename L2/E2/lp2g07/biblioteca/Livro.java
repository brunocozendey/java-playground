package lp2g07.biblioteca;
import java.util.GregorianCalendar;
import java.util.ArrayList; 
import java.text.SimpleDateFormat;
import java.io.*;

public class Livro implements Serializable
{
    public EmprestadoPara emp_para = new EmprestadoPara();
    public String codLiv, titLiv, catLiv; //Cat = categoria
    public int qtd, emp;
    public ArrayList<EmprestadoPara> Historico = new ArrayList<EmprestadoPara>();

    //public void Livro(){
        /*this.codLiv = "";
        this.titLiv = "";
        this.catLiv = "";
        this.qtd = 0; //informa a quantidade de livros existentes.
        this.emp = 0;*/
    //}

    public Livro(String tit){
        codLiv = "";
        titLiv = tit;
        catLiv = "";
        qtd = 0; //informa a quantidade de livros existentes.
        emp = 0;
    }
    public Livro(){
        this.codLiv = "";
        this.titLiv = "";
        this.catLiv = "";
        this.qtd = 0; //informa a quantidade de livros existentes.
        this.emp = 0; //Informa a quantidade de livro emprestado.
    }
/*
    public void Livro(String tit){
        this.titLiv = tit;
        /*codLiv = new String();
        titLiv = new String();
        catLiv = new String();
        qtd = new int();
        emp = new int();*/
    //}

    public String getCod(){
        return codLiv;
    }

    public GregorianCalendar getDataEmp(){
        return emp_para.data_empr;
    }

    public GregorianCalendar getDataDev(){
        return emp_para.data_dev;
    }

    public String getTit(){
        return titLiv;
    }
    public void empresta(){
        try{
            if (qtd == 0) {
                CopiaNaoDisponivelEx erroCopDisp = new CopiaNaoDisponivelEx();
                throw erroCopDisp;
            }
            else{
                emp++;
                qtd--;
            }
        }
        catch(Exception e){
            System.out.println("Erro:"+e);
        }

    }

    public void devolve(){
        try{
            if (emp>0){
                emp--;
                qtd++;
            }
            else{
                NenhumaCopiaEmprestadaEx erroCopEmp = new NenhumaCopiaEmprestadaEx();
                throw erroCopEmp;
            } 
        }
        catch(Exception e){
            System.out.println("Erro:"+e);
        }

    }

    public void addUsuarioHist(GregorianCalendar dl,GregorianCalendar dd, int codu){
        emp_para.data_empr = dl;
        emp_para.data_dev = dd;
        emp_para.codUsuario = codu;
        Historico.add(emp_para);
    }
    @Override
    public String toString(){
        String out = "";
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<EmprestadoPara> Historico = new ArrayList<EmprestadoPara>(); 
        for (int j=0;j < (Historico.size());j++){
            out += Historico.get(j)+"\n";
        }

        return "Codigo do Livro: "+codLiv+"\n"+"Titulo: "+titLiv+"\n"+"Categoria: "+catLiv+"\n"+"Quantidade disponivel: "+Integer.toString(qtd)+"\n"+"Quantidade emprestada: "+Integer.toString(emp)+"\n"+"Historico: "+out;
    }

}
