import java.util.*;


public class selectionsort
{
    private String[] arr;

    public selectionsort()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=sc.nextInt();
        arr=new String[n];
        System.out.println("Enter the names : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the "+i+" name: ");
            arr[i]=sc.next();
            
        
        }
    }
    public static void main(String args[])
    {
        selectionsort ob=new selectionsort();
        ob.displayarray();
        ob.selectionsrt();
        ob.displayarray();
    }

    public void selectionsrt()
    {
        for(int i=0;i<=(arr.length-2);i++)
        {
            for(int j=i+1;j<=(arr.length-1);j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
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