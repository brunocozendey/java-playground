class ErrMenosArg extends IllegalArgumentException /* RuntimeException */{
    
    public ErrMenosArg(){
        super("A quantidade de argumentos e menor");
    }
}