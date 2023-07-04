import java.util.*;
class queue
{
    private int[] arr;
    private int front;
    private int rear;
    private final int max=100;

    public queue()
    {
        arr=new int[max];
        front=-1;
        rear=-1;
    }

    public void insert(int e)
    {
        if((front==0 && rear==max-1) || (front==rear+1))
        {
            System.out.println("Queue is full!");
            return;
        }
        else if(front==-1)
        {
            front=0;
            rear=0;
            arr[rear]=e;
        }
        else if(rear==max-1)
        {
            rear=0;
        }
        else
        {
            rear++;
            arr[rear]=e;
        }

    }

    public void traverse()
    {
        if(front==-1)
        {
            System.out.println("Stack is empty!");
            return;
        }
        else if(front<=rear)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(arr[i]+"\t");
            }
        }
        else if(front>rear)
        {
            for(int i=front;i<=max-1;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.print(arr[i]+"\t");

            }
        }

    }

    public int delete()
    {
        int d;
        if(front==-1)
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        d=arr[front];
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else if(front==max-1)
        {
            front=0;
        }
        else
        {
            front++;
        }
        return d;
    }
}

class circularqueue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        queue ob=new queue();
        while(true)
        {
            menu();
            System.out.print("Enter your choice:");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter the element:");
                    int e=sc.nextInt();
                    ob.insert(e);
                    break;
                case 2:
                    int d=ob.delete();
                    System.out.println("element deleted:"+d);
                    break;
                case 3:
                    ob.traverse();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public static void menu()
    {
        System.out.println("***    Menu    ***");
        System.out.println("***  1.Insert  ***");
        System.out.println("***  2.Delete  ***");
        System.out.println("*** 3.Traverse ***");
        System.out.println("***   0.Exit   ***");
    }
}