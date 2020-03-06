import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class DataTest{

    public static void main(String[] args){

        
        Date d = new Date();
        GregorianCalendar hj = new GregorianCalendar();
        GregorianCalendar devolucao = new GregorianCalendar();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy"); 
        
        hj.setTime(d);

        devolucao.setTime(d);
        devolucao.set(Calendar.DATE, devolucao.get(Calendar.DATE) + 15); //15 dias apos a data de retirada e a devolucao

        
        System.out.println(dataFormatada.format(hj.getTimeInMillis()));
        System.out.println(dataFormatada.format(devolucao.getTimeInMillis()));


    }
}