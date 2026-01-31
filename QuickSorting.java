import java.util.Arrays;

public class QuickSorting {
    public  void quicksort(int[] a,int low,int high){
        int start=low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=a[mid];
        if(low>=high){
            return;
        }
        while(start<=end){
            while(a[start]<pivot){
                start++;
            }
            while(a[end]>pivot){
                    end--;
            }
            if(start<=end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        quicksort(a,low,end);
        quicksort(a,start,high);
    }
    public static void main(String[] args) {
        int[] a = { 1, 28, 22, 33, 5, 6, 17, 8, 9, 0 };
        System.out.println(Arrays.toString(a));
        QuickSorting qs = new QuickSorting();
        qs.quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }
}
