import java.io.*;
import java.util.*;

class InheriPoly1
{
    
    public static void main(String args[]) throws IOException
    {
   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your choice");
      System.out.println("1.Enter and Display the Employee details \n 2.Enter and display the Manager details \n 3.Exit");
      int ch1=sc.nextInt();
      switch(ch1)
      {
          case 1:
           System.out.println("Enter the number of Employee you want to insert the details of");
           int n=sc.nextInt();

             Employee[] e1=new Employee[5];
             for(int i=0;i<n;i++)
             {
                e1[i].insertEmp();
                e1[i].displayEmp();
             }


           break;

           case 2:
           System.out.println("Enter the number of Managers deatails you want to insert");
           int n1=sc.nextInt();

             Manager[] m=new Manager[5];
             for(int i=0;i<n1;i++)
             {
                m[i].insertMan();
                m[i].displayMan();
             }

             break;

      }  

    }

}










class Employee
{

   double hra,da;
   String name;
   double basicpay;
   Scanner sc=new Scanner(System.in);
    void insertEmp()
    {
     
      System.out.println("Enter the Employee name");
      name=sc.nextLine();
      System.out.println("Enter the Basic Salary of Employee");
      basicpay=sc.nextDouble(); 
      calculateSalary(basicpay); 
    }

    double calculateSalary(double basicpay)
   {
       hra=0.2*basicpay;
       da=0.1*basicpay;
       return basicpay+hra+da;
   }

    void displayEmp()
    {
     System.out.println("The name of Employee is"+" " +name);
     System.out.println("The HRA (20%) of Employee is"+" " +hra);
     System.out.println("The DA of Employee  is"+" "  +da);
     System.out.println("The basic pay Salary of Employee  is"+" "+basicpay);
     System.out.println("The total Salary of Employee  is"+" "+calculateSalary(basicpay));
    }
}   



class Manager
{
   double hra1,da1;
   String name1;
   double basicpay1;
   double bonus;
   Scanner sc=new Scanner(System.in);
    void insertMan()
    {
      
      System.out.println("Enter the Manager name");
      name1=sc.nextLine();
      System.out.println("Enter the Basic Salary of Manager");
      basicpay1=sc.nextDouble();  
      System.out.println("Enter the Bonus of Manager");
       bonus=sc.nextDouble();  
       calculateSalary1(basicpay1);
    }

    double calculateSalary1(double basicpay1)
   {
       hra1=0.2*basicpay1;
       da1=0.1*basicpay1;
       return basicpay1+hra1+da1;
   }

    void displayMan()
    {
     System.out.println("The name of Employee is"+" " +name1);
     System.out.println("The HRA (20%) of Employee is"+" " +hra1);
     System.out.println("The DA of Employee  is"+" "  +da1);
     System.out.println("The basic pay Salary of Employee  is"+" "+basicpay1);
     System.out.println("The total Salary of Employee  is"+" "+calculateSalary1(basicpay1));
     System.out.println("The Final Salary of Employee  is"+" "+calculateSalary1(basicpay1)+bonus);
    }
}