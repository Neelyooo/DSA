import java.util.*;
class maxmininarray
{
    private int arr[]=new int[5];

    public maxmininarray()                          
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of array");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args)
    {
        maxmininarray ob=new maxmininarray();
        int max=ob.maxarr();
        int min=ob.minarr();
        System.out.println("Max="+max+"\t"+"Min="+min);
        
    }

    public  int maxarr()             
    {
        int max=arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    
    public  int minarr()
    {
        int min=arr[0];
        for(int i=0;i<5;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}