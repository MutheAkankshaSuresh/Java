import java.io.*;
import java.util.*;

interface Arithmetic
{
     int add(int a,int b);
     int sub(int a,int b);
     int mul(int a,int b);
    float div(int a,int b);
}

 class calci1 implements Arithmetic
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
       
}

class interface1
{
    public static void main(String args[])
    {
        int ch,a,b;
        calci1 c1=new calci1();
        Scanner sc=new Scanner(System.in);
       do{

        System.out.println("\n Enter your choice");
        System.out.println("\n 1.Arithmetic Operation \n 2.Factorial Operation \n 3.Exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("\n Enter the value1 ");
            a=sc.nextInt();
            System.out.println("\n Enter the value2");
            b=sc.nextInt();
            System.out.println(c1.add(a,b));
            System.out.println(c1.sub(a,b));
            System.out.println(c1.mul(a,b));
            System.out.println(c1.div(a,b));
            break;

            case 2:
            break;

        } 



        }while(ch!=2);

    }
}