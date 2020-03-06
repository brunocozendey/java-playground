class ErrMaisArg extends IllegalArgumentException /* RuntimeException */{
    
    public ErrMaisArg(){
        super("A quantidade de argumentos e maior");
    }
}