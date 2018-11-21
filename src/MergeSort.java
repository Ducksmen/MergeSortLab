import java.util.Random;

public class MergeSort
{
    public int[] genInts(int n)
    {
        int[] elements = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++)
        {
            elements[i] = random.nextInt(10000);
        }
        return elements;
    }

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

    private static void merge(int[] elements, int from, int middle, int to, int[] temp) {
        for(int l = from;l<=to;l++)
        {
            temp[l]=elements[l];
        }
        int i = from;
        int j = middle + 1;
        int k = from;
        while (i <= middle && j <= to)
        {
            if (temp[i] < temp[j])
            {
                elements[k] = temp[i];
                i++;
            }
            else
                {
                elements[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle)
        {
            elements[k] = temp[i];
            i++;
            k++;
        }
        while (j <= to) {
            elements[k] = temp[j];
            j++;
            k++;
        }
    }
}
