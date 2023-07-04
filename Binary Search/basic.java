import java.util.*;

public class basic
{
    private int arr[]={10,20,30,40,50,60,70,80,90,95};
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int n=sc.nextInt();
        basic ob=new basic();
        int found=ob.binarysearch(n);
        if(found==-1)
        System.out.println("Not Found");
        else
        System.out.println("Found at "+found+" position");
    }

    public int binarysearch(int key)
    {
        int l=0;
        int u=arr.length;
        while(l<=u)
        {
            int m=(l+u)/2;
            if(arr[m]==key)
            return m;
            else if(key>arr[m])
            l=m+1;
            else
            u=m-1;
        }

        return -1;
    }
}