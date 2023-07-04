import java.util.*;

public class bubblesort
{
    private String arr[];

    public bubblesort()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n=sc.nextInt();
        arr=new String[n];
        System.out.println("Enter the names : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the "+i+" name: ");
            arr[i]=sc.next();
        }
    }
    public static void main(String args[])
    {
        bubblesort ob=new bubblesort();
        ob.displayarray();
        ob.bubblesorting();
        ob.displayarray();
    }

    public void bubblesorting()
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=0;j<=arr.length-2-i;j++)
            {
                if(arr[j].compareTo(arr[j+1])>0)
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }

    public void displayarray()
    {
        System.out.println("--------------------- ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


}