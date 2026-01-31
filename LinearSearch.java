import java.util.Arrays;

public class LinearSearch {
    public static int find(int a[],int t)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==t)
                return i;
        }
        return -1;
    }
    public static boolean contains(int a[],int t)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==t)
                return true;
        }
        return false;
    }
    public static boolean contains(String a,char ch)
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==ch)
                return true;
        }
        return false;
    }
    public static int[] find(int a[][],int t)
    {
        int row=0,col=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==t)
                {
                    row=i;
                    col=j;
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int a[]=new int[]{3,7,5,2,9,7,2,6,911,3};
        System.out.println(find(a,229));
        System.out.println(contains(a,9));
        String b="mkmathesh";
        System.out.println(contains(b,'e'));
        int c[][]=new int[][]{
                {1,2,3,4},
                {55,4,3,45,5},
                {2,3,4,54,5}
        };
        int []s=find(c,2);
        System.out.println(Arrays.toString(s));



    }
}
