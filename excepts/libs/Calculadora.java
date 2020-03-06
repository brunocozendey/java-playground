package br.uerj.lp2.libs;

import java.io.*;
import br.uerj.ime.lp2.exc*;

public class Calculadora //implements CalcIntf
{
    public int soma(int a, int b)
    {
        /*if ((a > 100) || (b > 10)){
            ErrParEx erroPar = new ErrParEx();
            throw erroPar;
        }*/
        return a+b;       
    }    

    public int sub(int a, int b)
    {
        /*if ((a > 100) || (b > 10)){
            ErrParEx erroPar2 = new ErrParEx();
            throw erroPar2;
        }*/
        return a-b;
    }

    public double mult(double a, double b) 
    {
        return (double) a*b;
    }

    public double div(double a, double b)
    {
        if (b == 0){
            Div0Ex erroDiv = new Div0Ex();
            throw erroDiv;
        }
        return (double) a/b;
    }
}
