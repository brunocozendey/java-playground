public class Minimum
{
    public int Minimum(int[] a, int size)
    {
        if (size == 1) return a[0];
        else
        {
            int y = Minimum(a,size-1);
            if (y < a[size - 1]) return y;
            else return a[size-1];
        }
    }
}