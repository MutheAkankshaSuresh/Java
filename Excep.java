import java.io.*;
import java.util.*;

class Excep
{
        
       public static void main(String args[])
       {
        Scanner sc=new Scanner(System.in);
         int model_no,size,pp,a,b,c;
         System.out.println("\n Enter the Television Details");
         while(true){ 
         System.out.println("Enter the Model number of Television [under(9999)]"); 
         model_no=sc.nextInt();
         try{
         Model_no(model_no);
         break;
         }
         catch (Model_noException e) {
            System.out.println("User-defined Model_noException: " + e.getMessage());
        }
     }
        while (true) {
            System.out.println("Enter the Model size of Television [valid range: 12 to 70]");
            size = sc.nextInt();
            try {
                Model_size(size);
                break; 
            } catch (Model_sizeException e) {
                System.out.println("User-defined Model_sizeException: " + e.getMessage());
            }
        }
        while(true){
         System.out.println("Enter the Model prize of Television [in_between 0-50000]");    
         pp=sc.nextInt();  
         try{ 
         Model_pp(pp);
         break;
        }
         catch(Model_ppException e)
         {
            System.out.println("User-defined Model_ppException: " + e.getMessage()); 
         }
         finally
         {
            System.out.println("Wowwwwww your Order of Television is placed ...Soon you will received it");
         }
        }
       
      
      //Default Exception
      int arr[]={5,6,7,4,3};
      try
      {
       System.out.println(arr[6]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("The array is OUt Of Bound");
      }
      
       
      //Existing Exception
      System.out.println("Enter a value");
      a=sc.nextInt();
      System.out.println("Enter b value");
      b=sc.nextInt();
       c=a/b;
      
        

       }  
       
       public static void Model_no(int model_no) throws Model_noException
       {
          
          if(model_no<0 || model_no>9999)
          {
             throw new Model_noException("The Model Number of television is not valid");
            
          }
          else{
            System.out.println("Thank you for Entering valid Model_Number");
          }
        
       }

       public static void Model_size(int size) throws Model_sizeException
       {
           if(size<12 ||size>70)
           {
             throw new Model_sizeException("The Model Size of television is not valid");
           }
           else
           {
            System.out.println("Thank you for Entering valid Model_Size");
           }
       }

       public static void Model_pp(int pp) throws Model_ppException
       {
           if(pp<0 || pp>50000)
           {
            throw new Model_ppException("The Model Price of television is not valid");
           }

           else{
            System.out.println("Thank you for Entering valid Model_Price");
           }
       }
}

class Model_noException extends Exception 
{
    public Model_noException(String msg)
    {
        super(msg);
    }
}

class Model_sizeException extends Exception
{
    public Model_sizeException(String msg1)
    {
       super(msg1);
    }
}

class Model_ppException extends Exception{
    public Model_ppException(String msg2)
    {
        super(msg2);
    }
}

