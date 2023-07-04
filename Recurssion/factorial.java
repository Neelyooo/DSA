import java.util.*;

class factorial
{
    private static long mul=1;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no: ");
        long n=sc.nextInt();
        long fact=fact(n);
        System.out.println("Factorial = "+fact);
    }

    public static long fact(long k)
    {
        if(k>0)
        {
        mul=mul*k;
        k--;
        fact(k);
        }
        return mul;
    }
}
