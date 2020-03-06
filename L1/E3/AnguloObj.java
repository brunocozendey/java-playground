import java.io.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class AnguloObj
{
    private double arcoRad;
    public double arcoGra;
    private DecimalFormat format = new DecimalFormat("##.00");
    
    public void AnguloObj(double ang)
    {   
        arcoGra = ang;
        arcoRad = converteAngulo();
        //return arcoRad; //Aqui, o this representa a variavel que esta fora do escopo, ou seja, o que recebemos como argumento é passado para a variavel de instancia.
    }

    public String toString()
    {
        return "Arco: "+String.format("%.2f", arcoRad)+" rad\n"+"Cosseno: "+String.format("%.2f",funcaoCoseno())+"\nTangente: "+String.format("%.2f",funcaoTangente())+"\nCotangente:"+String.format("%.2f",funcaoCotangente())+"\n";
    }

    public double converteAngulo() throws ErrType
    {
        return (double) (Math.PI*arcoGra)/180.00;
    }

    public double funcaoSeno() throws ErrType
    {
        return (double) Math.sin(arcoRad);
    }

    public double funcaoCoseno() throws ErrType
    {
        return (double) Math.cos(arcoRad);
    }

    public double funcaoTangente() throws ErrType
    {
        return (double) Math.tan(arcoRad);
    }

    public double funcaoCotangente() throws ErrType
    {
        return (double) 1/(Math.tan(arcoRad));
    }

}
