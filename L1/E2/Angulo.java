import java.io.*;
import java.lang.Math;

public class Angulo
{
    //Area do circulo
    public static double converteAngulo(double a) throws ErrType
    {
        return (double) (Math.PI*a)/180;
    }

    public static double funcaoSeno(double a) throws ErrType
    {
        return (double) Math.sin(converteAngulo(a));
    }

    public static double funcaoCoseno(double a) throws ErrType
    {
        return (double) Math.cos(converteAngulo(a));
    }

    public static double funcaoTangente(double a) throws ErrType
    {
        return (double) Math.tan(converteAngulo(a));
    }

    public static double funcaoCotangente(double a) throws ErrType
    {
        return (double) 1/(Math.tan(converteAngulo(a)));
    }
}
