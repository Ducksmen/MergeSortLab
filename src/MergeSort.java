public class MergeSort
{
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        {
            mergeSortHelper(elements, 0, n -1, temp);
        }
    }

    private static void  mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if(from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements,middle + 1,  to, temp);
            merge(elements, from, middle, to, temp);
        }
    }

    private static void merge(int[] elements, int from, int middle, int to, int[] temp)
    {
        
    }
}
