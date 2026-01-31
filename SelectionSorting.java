import java.util.Arrays;

public class SelectionSorting {
    public static int[] selectionsort(int[] a) {
        int n = a.length;
        int min = 0,minIndex =0;
        for (int i = 0; i < n; i++) {
            min=a[i];
            for (int j = i+1; j < n; j++) {
                if (a[j]<min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i];
            a[i] = min;
        }
        return a;

    }
    public static void main(String[] args) {
        int[] a = { 1, 28, 22, 33, 5, 6, 17, 8, 9, 0 };
        System.out.println(Arrays.toString(a));
        int b[]=selectionsort(a);
        System.out.println(Arrays.toString(b));
    }
}
