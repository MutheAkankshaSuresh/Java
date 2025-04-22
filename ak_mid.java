import java.io.*;
import java.util.*;




class Student
{
   String name;
   int roll;
   Scanner sc=new Scanner(System.in);
   public void input ()
   {
     System.out.println("Enter the name of Student");
     name=sc.nextLine();
     System.out.println("Enter the roll no of Student");
     roll=sc.nextInt();         
   }
   
   void display1()
   {
       System.out.println("The name of Student is "+name);
       System.out.println("THe roll no of Student is"+roll);
   }
}

 class Subject 
{
   Scanner sc=new Scanner(System.in);
   int m1,m2,m3,m4,m5;
    public void input2()
    {
            System.out.println("Enter the marks of 1 Subjects of Student");
            m1=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the marks of 2 Subjects of Student");
            m2=sc.nextInt();
               sc.nextLine();
            System.out.println("Enter the marks of 3 Subjects of Student");
            m3=sc.nextInt();
               sc.nextLine();
            System.out.println("Enter the marks of 4 Subjects of Student");
            m4=sc.nextInt();
               sc.nextLine();
            System.out.println("Enter the marks of 5 Subjects of Student");
            m5=sc.nextInt();
            Calculateper();
    }
   
   public double Calculateper()
   {
      double per;
      per=(m1+m2+m3+m4+m5)/500*100;
      return per;
   }
   
   void display2()
   {
      System.out.println("The percentage of Student is"+Calculateper());
   }
   

}

  
public class ak_mid
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n,ch;
  
        
         Student s1=new Student();
         Subject c1=new Subject();
         int roll;
         do{
            System.out.println("Enter your Choice");
            System.out.println("1.Input the Student Basic Details(Name,Rollno) \n 2.Input the Subjects of Student with marks \3.Display the Percentage and Basic    Details of Student ");
            ch=sc.nextInt();
            switch(ch)
            {
    
            case 1:                
            s1.input();
            s1.display1();
            
            break;
            
            case 2:                      
            c1.input2();
            c1.display2();         
            break;
         
            
            case 3:
            break;
            
               
            }
         }while(ch!=3);
         
     }
}
