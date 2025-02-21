import java.io.*;
import java.util.*;

interface Arithmetic
{
     int add(int a,int b);
     int sub(int a,int b);
     int mul(int a,int b);
    float div(int a,int b);
}

interface factorial
{
    int fact(int n);
    
} 

interface fibonacci
{
    void fibo(int n1);
}
interface all extends Arithmetic,factorial,fibonacci
{

}

 class calci1 implements all
{
    public int add(int a,int b)
    {
        int c=a+b;
        return c;
        
    }

    public int sub(int a,int b)
    {
        int c=a-b;
        return c;
    }

    public int mul(int a,int b)
    {
        int c=a*b;
        return c;
    }

    public float div(int a,int b)
    {
        int c=a/b;
        return c;
    }
    
    public int fact(int n)
    {
       int fact1=1;
       for(int i=1;i<=n;i++)
       {
           fact1*=i;
          
       }
       return fact1;
      
    }
    
    public void fibo(int n1)
    {
        int a=0,b=1,c;
        System.out.println("The Factorial of Number is"+"\n"+a +"\n"+b+" ");
        for(int i=2;i<n1;i++)
        {
            c=a+b;
            System.out.println(c+"");
            a=b;
            b=c;
        }
      
    }
}

class interface1
{
    public static void main(String args[])
    {
        int ch,a,b,n,n1;
        calci1 c1=new calci1();
        Scanner sc=new Scanner(System.in);
       do{

        System.out.println("\n Enter your choice");
        System.out.println(" 1.Arithmetic Operation \n 2.Factorial Operation \n 3.Fibonacci Series \n 4.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            while(true)
        {
            System.out.println("Enter the value1 ");
            a=sc.nextInt();
            System.out.println(" Enter the value2");
            b=sc.nextInt();
         
            if(a==0 && b==0) 
            { 
                System.out.println("The values you entered are not appropriate");
                continue;
            }
            
            System.out.println("The Addition of value1 & value2 is"+" "+c1.add(a,b));
            System.out.println("The Substraction of value1 & value2 is"+" "+c1.sub(a,b));
            System.out.println("The Multiplication of value1 & value2 is"+" "+c1.mul(a,b));
            try{
            System.out.println("The Division of value1 & value2 is"+" "+c1.div(a,b));
            }
            catch(Exception e)
            {
                System.out.println("Exception :"+e.getMessage());
            }
            break;
        }
            break;

            case 2:
            while(true){
            System.out.println(" Enter the number to find its factorial");
            n=sc.nextInt();
            if(n==0)
            {
               System.out.println(" The value you entered is 0 reEnter the value again");
               continue;
            }
            System.out.println(" The factorial of "+n +" "+"is"+" "+c1.fact(n));
            break;
           }
           break;
            
            case 3:
            while(true){
            System.out.println(" Enter the number to find its fibonacci series");
            n1=sc.nextInt();
              if(n1==0)
              {
                System.out.println(" The value you entered is 0 reEnter the value again");
                continue;
              }
            
            c1.fibo(n1);
            break;
        }
        break;
            
            case 4:
            break;

        } 



        }while(ch!=4);

    }
}
