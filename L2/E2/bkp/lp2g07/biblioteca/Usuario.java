package lp2g07.biblioteca;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Usuario extends Pessoa
{

    ArrayList <Emprestimo> Historico = new ArrayList <Emprestimo>(); 
    String endereco;
    int codigoUsuario=0;
    public Usuario(String e, int c){
        super();
        this.endereco = e;
        this.codigoUsuario = c;
    }

    public Usuario(){
        super();
        this.endereco = "";
        this.codigoUsuario = 0;
    }


    public void addLivroHist(GregorianCalendar data_loc, GregorianCalendar data_dev, String codLiv){
        Emprestimo emp = new Emprestimo();
        emp.data_emp = data_loc;
        emp.data_dev = data_dev;
        emp.codLivro = codLiv;
    }

    public int getCod(){
        return codigoUsuario;
    }

    public int setCod(){
        codigoUsuario++;
        return codigoUsuario;
    }

    public String getEnd(){
        return endereco;
    }

    @Override
    public String toString(){
        String out = "";
        ArrayList<EmprestadoPara> Historico = new ArrayList<EmprestadoPara>(); 
        for (int j=0;j < (Historico.size());j++){
            out += Historico.get(j)+"\n";
        }
        return "Endereço: "+endereco+"\n"+"Codigo Usuario: "+Integer.toString(codigoUsuario)+"\n"+"Historico: "+out;
    }


}