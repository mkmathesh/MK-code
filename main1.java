class linkedlist
{
    Node head;
    linkedlist()
    {
        head=null;
    }

    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    public void addfirst(int val)
    {
        Node newnode=new Node(val);
        Node prev=null;
        if(head==null)
        {
            head=newnode;
        }
        else {
          newnode.next=head;
          head=newnode;
        }
    }
    public void add(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void add(int pos,int val)
    {
        Node newnode=new Node(val);
        Node temp=head;
        Node prev=null;
        Node start=null;
        Node end=null;
        int count=0;
        if(pos==count)
        {
            if (head==null)
            {
                head.data=val;
                head.next=null;
            }
            else {
                newnode.next=head;
                head=newnode;
                newnode.next=temp;
            }
        }
        else {
            while (temp!=null && count-1!=pos)
            {
                start=temp;
                temp=temp.next;
                count++;
            }
            if(temp!=null)
            {
                end=temp.next;
                start.next=newnode;
                newnode.next=temp;
                temp.next=end;
            }
            else {
                prev=temp;
                temp.next=newnode;
                newnode.next=prev;
            }





        }

    }
    public void addall(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            add(arr[i]);
        }
    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int val)
    {
        Node temp=head;
        Node prev=null;
        if(temp.data==val)
        {
            head=temp.next;
        }
        else{
            while (temp.data!=val && temp.next!=null)
            {
                prev=temp;
                temp=temp.next;

            }
            prev.next=temp.next;
        }


    }
    public boolean contains(int val)
    {
        Node temp=head;
        while (temp!=null)
        {
            if(temp.data==val)
            {
                return true;
            }

            temp=temp.next;
        }
        return false;
    }
    public int indexof(int val)
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            if(temp.data==val)
            {
                return count;
            }
            count++;

            temp=temp.next;
        }
        System.out.println("not found!");
        return -1;
    }
    public void clear()
    {
        head=null;
    }
    public int get(int index)
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            if(count==index)
            {
                return temp.data;
            }
            count++;

            temp=temp.next;
        }
        return -1;
    }
    public int size()
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public boolean isempty()
    {
        Node temp=head;
       if(temp!=null)
       {
           return true;
       }
        return false;
    }
    public int poll()
    {
        Node temp=head;
        Node prev=null;
        int v=0;
        if(head==null)
        {
           return -1;
        }
        else {
            v=temp.data;
           head=temp.next;
        }
        return v;
    }
    public  void offer(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
        }
        else {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }

    }
    public int peek()
    {
        if(head==null)
        {
            return -1;
        }

        return head.data;
    }





}

public class main1 {
    public static linkedlist sumlist(linkedlist list1,linkedlist list2)
    {
        linkedlist list=new linkedlist();
        linkedlist.Node l1=list1.head;
        linkedlist.Node l2=list2.head;
        while (l1!=null)
        {
            list.offer(l1.data+l2.data);
            l1=l1.next;
            l2=l2.next;
        }
        return list;
    }
    public static linkedlist oddnum(linkedlist list1)
    {
        linkedlist.Node temp=list1.head;
        linkedlist list=new linkedlist();

        while (temp!=null)
        {
            if(temp.data%2==0)
            {
                list.add(temp.data);
            }
            temp=temp.next;
        }
        return list;
    }
    public static void main(String[] args)
    {
        linkedlist list1=new linkedlist();
        linkedlist list2=new linkedlist();
        linkedlist list3=new linkedlist();
        linkedlist odd=new linkedlist();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        list3=sumlist(list1,list2);
        list3.display();
        odd=oddnum(list1);
        odd.display();


    }
}
