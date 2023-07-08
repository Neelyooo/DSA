import java.util.*;
class node{
    private int data;
    protected node next;

    node(int e)
    {
        data=e;
        next=null;
    }

    public  String toString()
    {
        return (data+"");
    }

    public int getdata()
    {
        return data;
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
            r.next=head;
        }
        else
        {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=r;
            r.next=head;
        }
    }

    public void insertatfront(int e)
    {
        node r=new node(e);
        node temp=head;
        r.next=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=r;
        head=r;                       
    }

    public void insertatmiddle(int e, int pos)
    {
        node r=new node(e);
        node temp=head;
        for(int i=1;i<pos;i++)
        {
            temp=temp.next;
        }
        r.next=temp.next;
        temp.next=r;
    }

    public void traverse()
    {
        node temp=head;
        if(temp==null)
        {
            System.out.println("Linked list is empty.");
            return;
        }
        do
        {
            System.out.print(temp+"->");
            temp=temp.next;
        }while(temp!=head);
    }

    public void delete(int d)
    {
        node t=head;
        node prev=null;
        if(t.next==head)
        {
            head=null;
            return;
        }
        while(t.next!=head)
        {
            if(t.getdata()==d)
            {
                if(t==head)
                {
                    node temp=head;
                    while(temp.next!=head)
                    {
                        temp=temp.next;
                    }
                    head=t.next;
                    temp.next=head;
                }
                else
                {
                    prev.next=t.next;
                }
            }
            prev=t;
            t=t.next;
        }
    }
}

class circularlinkedlist
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
                    System.out.print("head->");
                    ob.traverse();
                    System.out.print("head");
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter the element.");
                    int ele=sc.nextInt();
                    ob.insertatfront(ele);
                    break;
                case 4:
                    System.out.print("Enter the element and pos:");
                    int element=sc.nextInt();
                    int pos=sc.nextInt();
                    ob.insertatmiddle(element, pos);
                    break;
                case 5:
                    System.out.print("Enter the element to be deleted:");
                    int del=sc.nextInt();
                    ob.delete(del);
                    ob.traverse();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
    

    public static void menu()
    {
        System.out.println("****   Menu   ****");
        System.out.println("1.Append ");
        System.out.println("2.Traverse ");
        System.out.println("3.Insert at front ");
        System.out.println("4.Insert at middle ");
        System.out.println("5.Delete ");
        System.out.println("6.Exit");
    }
}