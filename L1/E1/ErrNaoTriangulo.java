class ErrNaoTriangulo extends IllegalArgumentException /* RuntimeException */{
    
    public ErrNaoTriangulo(){
        super("Argumentos de catetos invalidos.");
    }
}