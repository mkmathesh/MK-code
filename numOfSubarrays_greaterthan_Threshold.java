import java.util.Arrays;

public class numOfSubarrays_greaterthan_Threshold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0;
        int r=0;
        int n=arr.length;
        int max=0;
        int sum=0;
        int count=0;
        while(r<k)
        {
            sum=sum+arr[r];
            r++;
        }
        max=sum/k;
        while(r<n)
        {
            sum-=arr[l];
            l++;
            sum+=arr[r];
            r++;
            max=sum/k;
            if(max>=threshold)
            {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[]  arr = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(arr,3,4));

    }
}
