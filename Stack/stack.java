import java.util.*;
class mystack
{
    private int[] arr;
    private int top;
    private static final int Max=100;

    mystack()
    {
        top=-1;
        arr=new int[Max];
    }

    public void push(int n)
    {
        if(top==Max-1)
        {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        arr[top]=n;
    }

    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty!");
            return -1;
        }
        int d=arr[top];
        top--;
        return d;
    }

    public void peep()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("----------------------");
        for(int i=top;i>=0;i--)                                             //You have to print fromm the top because in stack you cannot see the bottom element !
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n----------------------");
    }

    
}
public  class stack
{
    public static void main(String[] args)
    {
        mystack s=new mystack();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            menu();
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


    public static void menu()
    {
        System.out.println("***   Menu    ***");
        System.out.println("***   1.Push  ***");
        System.out.println("***   2.Pop   ***");
        System.out.println("***   3.Peep  ***");
        System.out.println("***   4.Exit  ***");
        System.out.println("Enter your choice");
    }
}
