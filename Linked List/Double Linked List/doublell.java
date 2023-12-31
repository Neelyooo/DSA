import java.util.*;

class node
{
    private int data;
    protected node next;
    protected node prev;

    node(int d)
    {
        data=d;
        next=null;
        prev=null;
    }
    
    public int getdata()
    {
        return data;
    }
}

class doublelinked
{
    private node head;

    doublelinked()
    {
        head=null;
    }

    public void append(int e)
    {
        node r=new node(e);
        node t=head;
        if(t==null)
        {
            head=r;
        }
        else
        {
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=r;
            r.prev=t;
        }
    }

    public void insertatfront(int e)
    {
        node r=new node(e);
        node temp=head;
        r.next=head;
        r.prev=null;
        temp.prev=r;
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
        r.prev=temp;
        temp.next=r;
    }


    public void traverse()
    {
        node t=head;
        do
        {
            System.out.print(t.getdata()+"->");
            t=t.next;
        }while(t!=null);
    }

    public void delete(int d)
    {
        node t=head;
        node prev=null;
        node next=null;
        if(t.next==null)
        {
            head=null;
            return;
        }
        while(t.next!=null)
        {
            if(t.getdata()==d)
            {
                if(t==head)
                {
                    node temp=head;
                    next=temp.next;
                    head=t.next;
                    next.prev=null;
                }
                else
                {
                    next.prev=t.prev;
                    prev.next=t.next;
                }
            }
            prev=t;
            t=t.next;
            next=t.next;
        }
    }

}
class doublell
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        doublelinked ob=new doublelinked();
        while(true)
        {
            menu();
            System.out.println("Enter the choice:");
            int ch=sc.nextInt();
            int e;
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the element:");
                    e=sc.nextInt();
                    ob.append(e);
                    break;
                case 2:
                    System.out.print("head->");
                    ob.traverse();
                    System.out.print("null\n");
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    e=sc.nextInt();
                    ob.insertatfront(e);
                    break;
                case 4:
                    System.out.println("Enter the element and pos:");
                    e=sc.nextInt();
                    int pos=sc.nextInt();
                    ob.insertatmiddle(e, pos);
                    break;
                case 5:
                    System.out.println("Enter the element :");
                    e=sc.nextInt();
                    ob.delete(e);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static void menu()
    {
        System.out.println("******** Menu ********");
        System.out.println("1.Append");
        System.out.println("2.Traverse");
        System.out.println("3.Insert at front");
        System.out.println("4.Insert at middle");
        System.out.println("5.Delete");
        System.out.println("6.Exit");
    }
}