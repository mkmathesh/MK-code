class Node
{
    int data;
    Node next;

    Node(int value)
    {
        data=value;
        next=null;
    }
}
class Linkedlist
{
    Node head;
    Linkedlist()
    {
        head=null;
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        return false;
    }
    public void insertatbegin(int value)
    {
        Node newnode=new Node(value);
        if (isEmpty())
        {
            head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertatend(int value)
    {
        Node newnode=new Node(value);
        if (isEmpty())
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
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
    public boolean find(int value)
    {
        Node temp=head;
        while (temp!=null)
        {
            if (temp.data==value)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int findposition(int pos)
    {
        Node temp=head;
        int count=-1;
        while (temp!=null)
        {
            if(pos==count)
            {
                return temp.data;
            }
            temp=temp.next;
            count++;
        }
        return 0;
    }
    public void insertatpos(int pos,int value)
    {
        Node newnode=new Node(value);
        Node temp=head;
        Node prev=null;
        int count=-1;
        while (temp!=null)
        {
            if(pos==count)
            {
                newnode.next=temp;
                temp=newnode;

            }
            temp=temp.next;
            count++;
        }
    }

}
public class linkedlistmain {
    public static void main(String[] args)
    {
        Linkedlist list=new Linkedlist();
        list.insertatend(100);
        list.insertatend(20);
        list.insertatend(3);
        list.insertatend(50);
        list.insertatbegin(4);
        list.display();
        System.out.println("//////////////\n");
        list.insertatpos(2,111);
        list.display();

    }
}
