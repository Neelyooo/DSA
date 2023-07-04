// wap to accept a no and disolay its reverse using a recurssive function
import java.util.*;

public class recurssive 
{
    private static int r=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        int rev= recur(n);
        System.out.println("Reverse="+rev);
    }
    
    public static int recur(int k)
    {
        if(k==0)
        return 0;
        else 
        {
            if(k>0)
            {
            int digit=k%10;
            r=r*10+digit;
            recur(k/10);
            }
            return r;
        }
    }
}