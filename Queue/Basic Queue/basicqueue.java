import java.util.*;
class queue
{
    private int[] arr;
    private int front,rear;
    private final int max=100;

    public queue()
    {
        arr=new int[max];
        front=rear=-1;
    }

    public void insert(int element)
    {
        if(rear==max-1)
        {
            System.out.println("Queue is full!");
            return;
        }
        else if(front==-1)
        {
            front=0;
        }
        rear++;
        arr[rear]=element;
    }

    public int  delete()
    {
        int d;
        if(front==-1)
        {
            System.out.println("Queue is empty.");
            return -1;
        }
        d=arr[front];
        front++;
        return d;
    }

    public void display()
    {
        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
    }
}

class basicqueue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        queue ob=new queue();
        while(true)
        {
            menu();
            System.out.print("Enter  you choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element:");
                    int n =sc.nextInt();
                    ob.insert(n);
                    break;
                case 2:
                    int deleted=ob.delete();
                    System.out.println("The element deleted="+deleted);
                    break;
                case 3:
                    ob.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    public static void menu()
    {
        System.out.println("****    Menu    ****");
        System.out.println("****  1.Insert  ****");
        System.out.println("****  2.Delete  ****");
        System.out.println("****  3.Display ****");
        System.out.println("****   4.Exit   ****");
    }
}