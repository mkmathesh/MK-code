import java.util.Arrays;

public class BubbleSorting {
    public static int[] bubblesort(int[] a) {
        int n = a.length-1;
        boolean swap = true;
        for (int i = 0; i <=n; i++) {
            swap = false;
            for (int j = 0; j <=n -i-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap != true) {
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = { 1, 28, 22, 33, 5, 6, 17, 8, 9, 0 };
        System.out.println(Arrays.toString(a));
        int b[]=bubblesort(a);
        System.out.println(Arrays.toString(b));

    }
}
