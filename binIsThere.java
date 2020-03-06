public class binIsThere
{
    public boolean binIsThere(int[] listsItems,int first, int last,int item)
    {
        if (first>last) return false;
        else
        {
            int mid;
            mid = (first+last)/2;
            if (listsItems[mid] == item) return true;
            else if (item < listsItems[mid]) return binIsThere(listsItems,first, mid-1,item);
            else return binIsThere(listsItems,mid+1,last, item);
        }
    }

}