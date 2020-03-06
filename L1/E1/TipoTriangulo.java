public class TipoTriangulo
{
    public static String tipo(float l1, float l2, float l3)
    {
        if ((l1==l2) && (l2 == l3)) return "Equilatero";
        else if ((l1==l2) || (l1==l3) || (l3==l2)) return "isosceles";
        else return "Escaleno";
    }
}