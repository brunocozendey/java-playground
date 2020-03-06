import java.io.*;
import java.lang.Math;

public class CalculaArea
{
    //Area do circulo
    public static float calcula(float r) throws ErrType
    {
        return (float) Math.PI*r*r;
    }

    //Area do Retangulo
    public static float calcula(float b, double a)
    {
        return (float) b*(float)a;
    }

    //Area do Triangulo
    public static float calcula(float l1, float l2, float l3) throws ErrNaoTriangulo
    {   
        //valida triângulo
        if ((l1 < (l2+l3)) && (l2 < (l1+l3)) && (l3 < (l2+l1)))
        {
            float p = (l1+l2+l3)/2;
            //Usando formula de heron S=raiz(p*(p-a)*(p-b)*(p-c)), onde p e semiperimetro, isto e, p=(a+b+c)/2
            return (float) Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
            
        }
        else 
        {
            ErrNaoTriangulo erroTriangulo = new ErrNaoTriangulo();
            throw erroTriangulo;
        }
        
    }


}
