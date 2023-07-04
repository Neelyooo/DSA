import java.util.*;
class basic
{
    private int arr[]=new int[5];

    public basic()                         
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
        basic ob=new basic();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the item to search:");
        int key=sc.nextInt();
        int found=ob.lsearch(key);
        if(found==-1)
        System.out.println("Not found");
        else 
        System.out.println("Element is found in "+found);
    }

    public int lsearch(int r)
    {
        for(int i=0;i<5;i++)
        {
            if(arr[i]==r)
            {
                return i;
            }
        }
        return -1;
    }
}