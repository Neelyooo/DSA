import java.util.*;

public class radixsort
{
    private static int arr[];
    private static int[][] buc= new int[10][15];
    public radixsort()
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
        radixsort ob=new radixsort();
        ob.displayarray();
        ob.radixsorting();
        ob.displayarray();
    }

    public void radixsorting()
    {
       int max= maxelement();
       int count =0;
       while(max>0)
       {
            count++;
            max=max/10;     
       }
       int digit=1;
       
       for(int i=0;i<count;i++)
       {  
            init_bucket();
            put_bucket(arr, digit);
            recollect_bucket();
            digit=digit*10;
       }
    }

    public static int maxelement()
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

    public static void init_bucket()
    {
        for(int i=0;i<buc.length;i++)
        {
            for(int j=0;j<buc[0].length;j++)
            {
                buc[i][j]=0;
            }
        }
    }

    public static void put_bucket(int[] arr1,int digit)
    {
        for(int i=0;i<arr1.length;i++)
        {
            int d=(arr1[i]/digit)%10;
            for(int j=0;j<buc[0].length;j++)
            {
                if(buc[d][j]==0)
                {
                    buc[d][j]=arr1[i];
                    break;
                }
            }
        }
    }

    public static void recollect_bucket()
    {
        int k=0;
        for(int i=0;i<buc.length;i++)
        {
            for(int j=0;j<buc[i].length;j++)
            {
                if(buc[i][j]!=0)
                {
                    arr[k]=buc[i][j];
                    k++;
                }
            }
        }
    }


    public static void displaybucket()
    {
        for(int i=0;i<buc.length;i++)
        {
            for(int j=0;j<buc[0].length;j++)
            {
                System.out.print(buc[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }

    public void displayarray()
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }

        System.out.println(" ");


    }


}