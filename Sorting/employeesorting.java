// WAP to manage the array of 5 employees (name,age,salary) and display the employee records in the ascending order of their salary
import java.util.*;

class employee
{
    private String name;
    private int age;
    private int salary;

    employee(String s, int a , int f)
    {
        name=s;
        age=a;
        salary=f;
    }

    public String toString()
    {
        return (name+" "+age+" "+salary);
    }

    public String getname()
    {
        return name;
    }

    public int getage()
    {
        return age;
    }

    public int getsalary()
    {
        return salary;
    }
}

class employeesorting
{
    private employee[] e;

    employeesorting()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of employees: ");
        int n=sc.nextInt();
        e=new employee[n];
        for(int i=0;i<e.length;i++)
        {
            System.out.print("Enter the name age salary of "+(i+1)+" employee:");
            String s=sc.next();
            int a=sc.nextInt();
            int f=sc.nextInt();
            e[i]=new employee(s,a,f);
        }
    }
    public static void main(String args[])
    {
        employeesorting ob=new employeesorting();
        System.out.println("Before Sorting:");
        ob.display();
        ob.insertionsort();
        System.out.println("After Sorting:");
        ob.display();
    }

    public void insertionsort()
    {
        for(int i=1;i<e.length;i++)
        {
            employee t=e[i];
            for(int j=0;j<i;j++)
            {
                if(e[j].getsalary()>t.getsalary())
                {
                    for(int k=i;k>j;k--)
                    {
                        e[k]=e[k-1];
                    }
                    e[j]=t;
                    break;
                }
            }
        }
    }

    public void display()
    {
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i]);
        }
    }
}