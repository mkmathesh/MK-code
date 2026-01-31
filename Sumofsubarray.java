public class Sumofsubarray {
    public static void main(String[] args) {
        int a[]={-1,2,3,3,4,5,-1};
        int k=2;
        int l=0;
        int r=0;
        int n=a.length;
        int max=0;
        int sum=0;
        while(r<k){
            sum+=a[r];
            r++;
        }
        max=sum;
        while(r<n){

            sum=sum-a[l];
            l++;
            sum+=a[r];
            r++;
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(";;;;");
        System.out.println(max);
    }
}
