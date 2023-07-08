import java.util.*;
class Stack
{
    private int arr[];
    private int top;
    private final int max=100;

    Stack()
    {
        arr=new int[max];
        top=-1;
    }

    public int gettop()
    {
        return top;
    }

    public void push(int e)
    {
        if(top==max-1)
        {
            System.out.println("Stack is full.");
            return;
        }
        top++;
        arr[top]=e;
    }

    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty.");
            return -1;
        }
        int d=arr[top];
        top--;
        return d;
    }

    public void traverse()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public int peep()
    {
        return arr[top];
    }
}

public class infixtopostfix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        System.out.print("Enter the expression:");
        String s=sc.next();
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        arr=conversion(arr,st);
        display(arr);
    }


public static char[] conversion(char[] arr,Stack st)
{
    char[] arr2=new char[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>=97 && arr[i]<=122)
        {
            arr2[j]=arr[i];
            j++;
        }
        else if(arr[i]==40)
        {
            st.push(arr[i]);
        }
        else if(arr[i]==41)
        {
            while(st.peep()!=40)
            {
                arr2[j]=(char)st.pop();
                j++;
            }
            st.pop();
        }
        else
        {
            if(st.gettop()==-1)
            {
                st.push(arr[i]);
            }
            else{
            while(st.peep()>=arr[i])
            {
                arr2[j]=(char)st.pop();
                j++;
            }            
            st.push(arr[i]);
        }
        }
    }

    if(st.gettop()!=-1)
    {
        while(st.gettop()!=-1)
        {
            arr2[j]=(char)st.pop();
            j++;
        }
    }
    return arr2;
}

public static void display(char[] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]);
    }
}
    
}