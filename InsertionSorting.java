import java.util.Arrays;

public class InsertionSorting {
    public static int[] insertionsort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else {
                    break;
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = { 1, 28, 22, 33, 5, 6, 17, 8, 9, 0 };
        System.out.println(Arrays.toString(a));
        int b[]=insertionsort(a);
        System.out.println(Arrays.toString(b));
    }
}
