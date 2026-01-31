public class BinarySearch {
    public static int find(int[]a,int x){
        int start=0;
        int end=a.length-1;
        boolean check=false;
        if(a[start]<a[end]){
            check=true;
        }
            while (start <= end) {
                int mid = (start + end) / 2;
                if (check) {
                    if (x > a[mid]) {
                        start = mid + 1;

                    } else if (x < a[mid]) {
                        end = mid - 1;
                    } else {
                        return mid;
                    }
                } else {
                    if (x > a[mid]) {
                        end = mid - 1;

                    } else if (x < a[mid]) {
                        start = mid + 1;
                    } else {
                        return mid;
                    }
                }

            }
        return -1;
    }
    public static void main(String[] args) {
        int a[]=new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println(BinarySearch.find(a,9));
    }
}
