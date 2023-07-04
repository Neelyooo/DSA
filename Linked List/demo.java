import java.util.*;
class node
{
    private int data;
    protected node link;

    node(int d)
    {
        data=d;
        link=null;
    }

    public int getdata()
    {
        return data;
    }


    public String toString()
    {
        return (""+data);
    }

}

class linkedlist
{
    private node head;

    linkedlist()
    {
        head=null;
    }

    public void append(int e)
    {
        node r=new node(e);
        if(head==null)
        {
            head=r;
        }
        else  
        {
            node t;
            t=head;
            while(t.link!=null)
            {
                t=t.link;
            }
            t.link=r;
        }
    }

    public void insertatfront(int e)
    {
        node r=new node(e);
        if(head==null)
        {
            head=r;
            return;
        }
        else
        {
            r.link=head.link;
            head=r;
        }

    }

    public void insertatmiddle(int e,int pos)
    {
        node r=new node(e);
        node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.link;
        }
        r.link=temp.link;
        temp.link=r;
    }

    public int count()
    {
        int count=0;
        node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.link;
        }
        return count;
    }

    public void reverse()
    {
        node temp=head;
        node prev=null;
        node next=null;
        while(temp!=null)
        {
            next=temp.link;
            temp.link=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }

    public void traverse()
    {
        node temp=head;
        if(temp==null)
        {
            System.out.println("Linked list is empty!");
            return;
        }
        while(temp!=null)
        {
            System.out.print(temp+"->");
            temp=temp.link;
        }
    }

    public void delete(int d)
    {
        node t=head;
        node prev=null;
        while(t!=null)
        {
            if(t.getdata()==d)
            {
                if(t==head)
                {
                    head=t.link;
                }
                else
                {
                    prev.link=t.link;
                }
                return;
            }
            prev=t;
            t=t.link;
        }
        System.out.println("Element is not found!");
    }
}


class demo
{
    public static void main(String args[])
    {
        linkedlist ob=new linkedlist();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            menu();
            System.out.print("Enter your choice=");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter the value:");
                    int e=sc.nextInt();
                    ob.append(e);
                    break;
                case 2:
                    ob.traverse();
                    System.out.print("NULL");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    int f=sc.nextInt();
                    ob.insertatfront(f);
                    break;
                case 4:
                    System.out.print("Enter the element and position to insert:");
                    int element=sc.nextInt();
                    int pos=sc.nextInt();
                    ob.insertatmiddle(element, pos);
                    break;
                case 5:
                    int count=ob.count();
                    System.out.println("The no of nodes="+count);
                    break;
                case 6:
                    System.out.print("Enter the value to be deleted:");
                    int delete=sc.nextInt();
                    ob.delete(delete);
                    ob.traverse();
                    break;
                case 7:
                    ob.reverse();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
    

    public static void menu()
    {
        System.out.println("****   Menu   ****");
        System.out.println("1.Append ");
        System.out.println("2.Traverse ");
        System.out.println("3.Insert at front");
        System.out.println("4.Insert at middle");
        System.out.println("5.Count no of nodes");
        System.out.println("6.Delete a node");
        System.out.println("7.Reverse");
        System.out.println("8.Exit");
    }
}