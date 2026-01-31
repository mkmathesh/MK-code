public class TwoSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int i=0;
        int j=a.length-1;
        int k=10;
        int sum=0;
        while(i<j){
            sum=a[i]+a[j];
            if(sum==k){
                break;
            }
            else if(sum<k){
                i++;
            }
            else if(sum>k){
                j--;
            }
        }
        if(sum==k){
            System.out.println(sum);
        }
        else{
            System.out.println(-1);
        }
    }
}
