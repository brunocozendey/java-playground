package lp2g07.biblioteca;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class EmprestadoPara
{
    GregorianCalendar data_empr, data_dev;
    int codUsuario;


    @Override
    public String toString(){
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Data Emprestimo: "+dataFormatada.format(data_empr.getTimeInMillis()) +"\n"+"Data Devolucao: "+dataFormatada.format(data_dev.getTimeInMillis()) + "\n" + "Codigo do usuario"+ Integer.toString(codUsuario);
    }
}


