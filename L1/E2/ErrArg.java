class ErrMenosArg extends IllegalArgumentException /* RuntimeException */{
    
    public ErrMenosArg(){
        super("Passe apenas um argumento de angulo.");
    }
}