package lp2g07.biblioteca;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Emprestimo
{
    GregorianCalendar data_emp,data_dev;
    String codLivro;

    public void Emprestimo(String cl, GregorianCalendar de, GregorianCalendar dd){
        data_emp = de;
        data_dev = dd;
        codLivro = cl;
    }


    @Override
    public String toString(){
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Data Emprestimo: "+dataFormatada.format(data_emp.getTimeInMillis()) + "\n"+"Data Devolucao: "+dataFormatada.format(data_dev.getTimeInMillis()) + "\n" + "Codigo do Livro"+ codLivro;
    }
}