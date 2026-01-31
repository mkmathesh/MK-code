import java.util.Arrays;
import java.util.Scanner;

public class MergeSorting {
    public void mergesort(int[] a, int start, int end)
    {
        if(end-start==1)
        {
            return;
        }
        int mid = (start+end)/2;
        mergesort(a,start,mid);//left
        mergesort(a,mid,end);//right
        merge(a,start,mid,end);
    }
    public void merge(int[] a, int start, int mid, int end) {
        int join[]=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid && j<end){
            if(a[i]<a[j])
            {
                join[k++]=a[i++];
            }
            else {
                join[k++]=a[j++];
            }
        }
        while(i<mid)
        {
            join[k++]=a[i++];
        }
        while(j<end)
        {
            join[k++]=a[j++];
        }
        for (int k1=0;k1<join.length;k1++)
        {
            a[start+k1]=join[k1];
        }
    }
    public static void main(String args[])
    {
        int[] a = { 1, 28, 22, 33, 5, 6, 17, 8, 9, 0 };
        System.out.println(Arrays.toString(a));
        MergeSorting ms = new MergeSorting();
        ms.mergesort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
}
