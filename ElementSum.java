public class ElementSum
{   
    public static void main(String[] args)
    {
        binIsThere bist = new binIsThere();
        Minimum min = new Minimum();

        int[] a = {1,2,3,4,5,6,7};
        System.out.println(sum(a,0,3));
        System.out.println((linearSearch(a,0,3,2)?("Encontrou"):("Não encontrado")));
        System.out.println((linearSearch(a,0,3,10)?("Encontrou"):("Não encontrado")));
        System.out.println((bist.binIsThere(a,0,3,2)?("Encontrou"):("Não encontrado")));
        System.out.println((bist.binIsThere(a,0,3,10)?("Encontrou"):("Não encontrado")));
        System.out.println(min.Minimum(a,7));
    }

    public static int sum(int[] a, int low, int last)
    {
        if (low == last)
        {
            return a[low];
        }
        else{
            return a[low] + sum(a, low+1,last);
        }
    }

    public static boolean linearSearch(int[] a, int low, int last, int item)
    {
        if (a[low] == item)
        {
            return true;
        }
        else if (low == last)
        {
            return false;
        }
        else 
        {
            return linearSearch(a, low+1, last, item);
        }
    }
}