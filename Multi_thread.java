import java.util.*;
import java.io.*;

class ticket extends Thread
{
    private static int avail_ticket = 10;  // Shared resource
    private String name;
    public ticket(String name)
    {
        this.name=name;
    }

    public void run()
    {
        synchronized(ticket.class)
        {
            checkAvailability();
            bookTicket();
            print();

        }
    }

    
    // Method to check if tickets are available

     public void checkAvailability()
     {
         System.out.println(name+" is checking seat availability \n");
         if(avail_ticket > 0)
         {
            System.out.println("Tickets available for " + name );

         }
         else
         {
            System.out.println("Sorry, no tickets available for " + name );

         }
     }
      
      // Method to book a ticket
     public void bookTicket()
     {
        if(avail_ticket>0)
        {
            avail_ticket--;
            System.out.println(name + " successfully booked a ticket.\n");
        }
     }

      // Method to print the ticket details
     public void print()
     {
        System.out.println(name + "'s ticket booked successfully! \n");
        System.out.println("Tickets remaining: " + avail_ticket );

     }
    
}


class TicketRunnable implements Runnable
{
    private static int avail_ticket = 10;  // Shared resource
    private String name;

    public TicketRunnable(String name) {
        this.name = name;
    }

    public void run() {
        synchronized (TicketRunnable.class) {  // Synchronizing the class level to ensure thread safety
            checkAvailability();
            bookTicket();
            print();
        }
    }

    // Method to check if tickets are available

    public void checkAvailability()
    {
        System.out.println(name+" is checking seat availability \n");
        if(avail_ticket > 0)
        {
           System.out.println("Tickets available for " + name );

        }
        else
        {
           System.out.println("Sorry, no tickets available for " + name);

        }
    }
     
     // Method to book a ticket
    public void bookTicket()
    {
       if(avail_ticket>0)
       {
           avail_ticket--;
           System.out.println(name + " successfully booked a ticket. \n");
       }
    }

     // Method to print the ticket details
    public void print()
    {
       System.out.println(name + "'s ticket booked successfully! \n");
       System.out.println("Tickets remaining: " + avail_ticket );

    }

}


public class Multi_thread {

    public static void main(String[] args) {
        // Through Extend Thread Method

        ticket user1 = new ticket("Akanksha");
        ticket user2 = new ticket("Sanskruti");
        ticket user3 = new ticket("Sayali");
        
        user1.start();  
        user2.start();  
        user3.start();  

        // Through (implements Runnable)
        TicketRunnable task4 = new TicketRunnable("Sakshi");
        TicketRunnable task5 = new TicketRunnable("Pushpa");
    
        Thread t1 = new Thread(task4);
        Thread t2 = new Thread(task5);
        
        t1.start();  
        t2.start();  
    }



    
}
