package exc.div0ex;

public class Div0Ex extends ArithmeticException{
    Div0Ex(){
        super("Zero como denominador.");
    }
}
