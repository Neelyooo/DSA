import java.util.*;
class node
{
    private int data;
    protected node link;

    node(int e)
    {
        data=e;
        link=null;
    }

    public int getdata()
    {
        return data;
    }
}



class mystack
{
    private node top;

    mystack()
    {
        top=null;
    }

    public void push(int n)
    {
        node r=new node(n);
        r.link=top;
        top=r;
    }

    public int pop()
    {
        int d=top.getdata();
        top=top.link;
        return d;
    }

    public void peep()
    {
        node t=top;
        while(t!=null)
        {
            System.out.print(t.getdata()+",");
            t=t.link;
        }
    }

    
}
public  class stackusingll
{
    public static void main(String[] args)
    {
        mystack s=new mystack();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            new stackusingll().menu();
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter the value to be inserted:");
                    int element=sc.nextInt();
                    s.push(element);
                    s.peep();
                    break;
                case 2:
                    int del=s.pop();
                    if(del==-1)
                    System.out.println("Stack is empty!");
                    else
                    System.out.println("Element deleted="+del);
                    break;
                case 3:
                    s.peep();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }


    public void menu()
    {
        System.out.println("***   Menu    ***");
        System.out.println("***   1.Push  ***");
        System.out.println("***   2.Pop   ***");
        System.out.println("***   3.Peep  ***");
        System.out.println("***   4.Exit  ***");
        System.out.println("Enter your choice");
    }
}
