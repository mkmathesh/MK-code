import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
@SuppressWarnings("unchecked")
class DynamicArrays<T> implements Iterable<T> {
    private static final int initialcapacity=8;
    private T[] arr;
    private int size;
    private int capacity;
    DynamicArrays(){
        arr =(T[])new  Objects[initialcapacity];
        size =0;
        capacity = initialcapacity;
    }

    public void add(T value){
        if(size==capacity){
            expandArray();

        }
        arr[size]=value;
        size++;

    }
    public void display(){
      for (T value:arr){
          System.out.print(value+" ");

      }
    }
    public void insert(T value,int index){
        if(size==capacity){
            expandArray();
        }
        for(int i=size;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=value;
        size++;

    }
    public void delete(int index){
        for (int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        if(capacity>initialcapacity && capacity>size*3){
            shrinkArray();
        }
    }
    public int length(){
        return size;

    }
    private void shrinkArray(){
        capacity = capacity/2;
        arr = Arrays.copyOf(arr,capacity);
    }
    private void expandArray(){
        capacity*=2;
        Arrays.copyOf(arr,capacity); //<---------------------
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index=0;
            public  T next(){
                return arr[index++];
            }
            public boolean hasNext() {
                return index<size;
            }

        };

    }
}
public class DynamicArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DynamicArrays<Integer> list = new DynamicArrays<Integer>();

        while(true)
        {
            System.out.println("1.INSERT AT END");
            System.out.println("2.DISPLAY");
            System.out.println("3.INSERT AT SPECIFIC POSITION");
            System.out.println("4.DELETE AT SPECIFIC POSITION");
            System.out.println("0.EXIT");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch(choice)
                {
                case 1:
                    System.out.println("Insert at end");
                    System.out.println("Enter the value: ");
                    int value = input.nextInt();
                    list.add(value);
                    break;
                    case 2:
                        list.display();
                        break;
                    case 3:
                        list.insert(1,0);
                }


        }
    }
}
