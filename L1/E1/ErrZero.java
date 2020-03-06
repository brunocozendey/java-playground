class ErrZero extends IllegalArgumentException /* RuntimeException */{
    
    public ErrZero(){
        super("O argumento nao pode ser zero");
    }
}