import java.util.*;

class terms
{
    private  int coff;
    private  int power;
    
    terms( int c,int p)
    {
        coff=c;
        power=p;
    }

    public String toString()
    {
        return (coff+"x^"+power+" ");
    }

    public int getcoff()
    {
        return coff;
    }

    
    public int getpower()
    {
        return power;
    }

}

class polynomial
{
    private terms[] ob;

    polynomial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n=sc.nextInt();
        ob=new terms[n];                                      //array of objects
        for(int i=0;i<n;i++)
        {
            System.out.println("ENter coff and degree of "+(i+1)+" term");
            int c=sc.nextInt();
            int p=sc.nextInt();
            ob[i]=new terms(c,p);                            
        }
    }
    public static void main(String[] args)
    {    
        Scanner sc=new Scanner(System.in);
        polynomial p=new polynomial();
        p.displaypol();
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        p.result(x);
    }

    public void result(int x)
    {
        int sum=0;
        for(int i=0;i<ob.length;i++)
        {
            sum=sum+(int)(ob[i].getcoff()*Math.pow(x,ob[i].getpower()));                       
        }
        System.out.print("Result of Polynomial = "+sum);
    }

    public void displaypol()
    {
        for(int i=0;i<ob.length-1;i++)
        {
            System.out.print(ob[i]+"+");                                                        
        }
        System.out.print(ob[ob.length-1]+"\n");
    }
}
