import java.util.*;

class book
{
    private String authorname;
    private String title;
    private int price;

    book(String a,String t,int p)
    {
        authorname=a;
        title=t;
        price=p;
    }

    public String toString()
    {
        return (authorname+" "+title+" "+price);
    }


    public int getprice()
    {
        return price;
    }
}
class mystack
{
    private book[] ob;
    private int top;
    private static final int Max=100;

    mystack()
    {
        top=-1;
        ob=new book[Max];
    }

    public int getmax()
    {
        return Max;
    }

    public void push(book n)
    {
        if(top==Max-1)
        {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        ob[top]=n;
    }

    public book pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty!");
            return new book("","",-1);
        }
        book d=ob[top];
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
            System.out.print(ob[i]+"\t");
        }
        System.out.println("\n----------------------");
    }

    
}
public  class Stackofbooks
{
    public static void main(String[] args)
    {
        mystack s=new mystack();
        Scanner sc=new Scanner(System.in);
        //book b=null;
        while(true)
        {
            new Stackofbooks().menu();
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter the name of author ,title and price of the book:");
                    String a=sc.next();
                    String t=sc.next();
                    int p=sc.nextInt();
                    book b=new book(a,t,p);
                    s.push(b);
                    s.peep();
                    break;
                case 2:
                    book del=s.pop();
                    if(del.getprice()==-1)
                    System.out.println("Stack is empty!");
                    else
                    System.out.println(del);
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
