import java.util.*;
class Array
{
    private int[] arr;
    private final int max=100;
    protected int n;

    Array(int no)
    {
        arr=new int[max];
        n=no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    public void show()
    {
        System.out.println("------------------------");
        
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println(" ");
        System.out.println("------------------------");
    }

    public void insertatpos(int number,int pos)                                              // when you insert there will be right shifting
    {
        if(pos==max)
        System.out.println("Array FULL !");
        else
        {
            for(int i=n;i>pos;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[pos]=number;
            n++;
        }
    }

    public void delete(int pos)                                                         // when you delete a element there will be left shifting
    {
        if(pos>=n)
        {
        System.out.println("There is NO element to delete !");
        return;
        }

        for(int i=pos;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
    }

    public void reverse()
    {
        int l=n-1;
        for(int i=0;i<n/2;i++)
        {
            int t=arr[i];
            arr[i]=arr[l];
            arr[l]=t;
            l--;
        }
    }

}
class basicarray
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements(MAX=100):");
        int no=sc.nextInt();
        Array ob=new Array(no);
        while(true)
        {
            menu();
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter the element to insert:");
                    int number=sc.nextInt();
                    System.out.print("Enter the position to insert:");
                    int pos=sc.nextInt();
                    ob.insertatpos(number,pos);
                    ob.show();
                    break;
                case 2:
                    ob.show();
                    break;
                case 3:
                    System.out.println("Enter the position to delete");
                    int pos2=sc.nextInt();
                    ob.delete(pos2);
                    break;
                case 4:
                    ob.reverse();
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }


    public static void menu()
    {
        System.out.println("***   menu   ***");
        System.out.println("1.Insert a element at given position");
        System.out.println("2.Traverse");
        System.out.println("3.Delete");
        System.out.println("4.Reverse");
        System.out.println("0.Exit");
    }

    }


