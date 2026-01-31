public class Maximum_Average_Subarray_I {
    public static  double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int l=0;
        int r=0;
        int n=nums.length;
        while(r<k)
        {
            sum=sum+nums[r];
            r++;
        }
        double max=(double)sum/k;
        while(r<n)
        {
            sum=sum-nums[l];
            l++;
            sum=sum+nums[r];
            r++;

            if((double)sum/k>max)
            {
                max=(double)sum/k;

            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,4,2};
        int k=4;
        System.out.println(findMaxAverage(nums,k));

    }
}
