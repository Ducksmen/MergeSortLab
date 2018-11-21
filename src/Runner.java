import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        MergeSort element = new MergeSort();
        int[] array = element.genInts(100);
        element.mergeSort(array);
        long time = System.nanoTime();
        System.out.println("Merge Sorting: " + (System.nanoTime()-time) + " Milliseconds");
        System.out.println(Arrays.toString(array));
    }
}
