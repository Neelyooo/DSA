import java.util.*;
class job
{
    private String name;
    private int priority;
    private int order;

    job(String s, int p,int o)
    {
        name=s;
        priority=p;
        order=o;
    }

    public String toString()
    {
        return ("Name= "+name+"\nPriority= "+priority+"\nOrder= "+order+"\n");
    }

    public int getpriority()
    {
        return priority;
    }


}

class queue
{
    private job ob[];
    private int front,rear;
    private final int max=100;

    public queue()
    {
        ob=new job[max];
        front=rear=-1;
    }

    public int getrear()
    {
        return rear;
    }

    public void insert(job obj)
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
        ob[rear]=obj;
    }

    public job  delete()
    {
        job d;
        if(front==-1)
        {
            System.out.println("Queue is empty.");
            return null;
        }
        d=ob[front];
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
            System.out.print(ob[i]);
        }
        System.out.println("\n");
    }

    public void sort()
    {
        for(int i=1;i<=rear;i++)
        {
            job t=ob[i];
            for(int j=0;j<i;j++)
            {
                if(ob[j].getpriority()>t.getpriority())
                {
                    for(int k=i;k>j;k--)
                    {
                        ob[k]=ob[k-1];
                    }
                    ob[j]=t;
                    break;
                }
            }
        }
    }
}

public class jobpriority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        queue q=new queue();
        while(true)
        {
            menu();
            System.out.print("Enter  you choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the name ,priority and order of the job:");
                    String s=sc.next();
                    int p =sc.nextInt();
                    int o=sc.nextInt();        
                    job j=new job(s, p, o);
                    q.insert(j);
                    break;
                case 2:
                    job deleted=q.delete();
                    System.out.println("The element deleted="+deleted);
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    q.sort();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public static void menu()
    {
        System.out.println("****            Menu                      ****");
        System.out.println("****           1.Insert                   ****");
        System.out.println("****           2.Delete                   ****");
        System.out.println("****           3.Display                  ****");
        System.out.println("****           4.Sort for Priority queue  ****");
        System.out.println("****           5.Exit                     ****");
    }
}