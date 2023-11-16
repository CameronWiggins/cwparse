package edu.francistuttle;
import java.util.ArrayList;

public class Computer 
{
    String id;
    String manufactor;
    String yearPurchased;
    String processor;
    ArrayList<Monitor> monitors;

    public Computer(String newID, String newManu, String newYrPrch, String newPrcs, ArrayList<Monitor> newMonitors)
    {
        id = newID;
        manufactor = newManu;
        yearPurchased = newYrPrch;
        processor = newPrcs;
        monitors = newMonitors;
    }

    public void  print()
    {
        System.out.println("Computer ID: " + id); 
        System.out.println("Manufactor : " + manufactor); 
        System.out.println("Year Purchased: " + yearPurchased); 
        System.out.println("Processor: " + processor);
        for(Monitor m : monitors)
        {
            m.print();
        }
    }
}
