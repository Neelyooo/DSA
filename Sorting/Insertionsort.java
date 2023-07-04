import java.util.*;

public class Insertionsort
{
    private int arr[];

    public Insertionsort()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the "+i+" no: ");
            arr[i]=sc.nextInt();
        } 
    }
    public static void main(String args[])
    {
        Insertionsort ob=new Insertionsort();
        ob.displayarray();
        ob.insertionsorting();
        ob.displayarray();
    }                                                                                      

    public void insertionsorting()
    {
        for(int i=1;i<arr.length;i++)
        {
            int t=arr[i];
            for(int j=0;j<i;j++)
            {
                if(arr[j]>t)
                {
                    for(int k=i;k>j;k--)
                    {
                        arr[k]=arr[k-1];
                    }
                    arr[j]=t;
                    break;
                }
            }
        }
    }

    public void displayarray()
    {
        System.out.println("--------------------- ");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n--------------------- ");
    }


}
