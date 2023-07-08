import java.util.*;
class mystacks
{
    private int arr[];
    private int top;
    private static final int max=100;

    mystacks()
    {
        arr=new int[max];
        top=-1;
    }

    public int gettop()
    {
        return top;
    }

    public void push(int c)
    {
        if(top==max-1)
        {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top]=c;
    }

    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        int c=arr[top];
        top--;
        return c;
    }
}

class Evaluationofpostfix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        mystacks ob=new mystacks();
        System.out.print("Enter the postfix expression:");
        String s=sc.next();
        s=s.toLowerCase();
        char[] arr=s.toCharArray();
        evaluation(arr,ob);
        int res=ob.pop();
        System.out.print("Result="+res);
    }

    public static void evaluation(char[] arr,mystacks ob)
    {
    
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=48 && arr[i]<=57)
            {
                
                ob.push((int)arr[i]-48);  
            }
            else
            {
                if(ob.gettop()!=0)
                {
                int a=ob.pop();
                int b=ob.pop();
                switch(arr[i])
                {
                    case '+':              
                        int c=a+b;
                        ob.push(c);
                        break;
                    
                    case '-':
                        int d=a-b;
                        ob.push(d);
                        break;
                        
                    case '*':
                        int e=a+b;
                        ob.push(e);
                        break;
                    
                    
                    case '/':
                        int f=a+b;
                        ob.push(f);
                        break;
                }
                } 
                else{
                        break;
                     }  
  
            }
        }
    }
}