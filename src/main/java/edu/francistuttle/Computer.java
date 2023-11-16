package edu.francistuttle;
import java.util.ArrayList;

public class Computer 
{
    String id;
    String manufactor;
    String yearPurchased;
    String processor;
    ArrayList<Monitor> monitors;

    public Computer(String newID, String newManu, String newYrPrch, String newPrcs, Monitor monitorOne, Monitor monitorTwo)
    {
        id = newID;
        manufactor = newManu;
        yearPurchased = newYrPrch;
        processor = newPrcs;
        monitors = new ArrayList<Monitor>();
        monitors.add(monitorOne);
        monitors.add(monitorTwo);
    }

    public void  print()
    {
        System.out.println("Computer ID: " + id); 
        System.out.println("Manufactor : " + manufactor); 
        System.out.println("Year Purchased: " + yearPurchased); 
        System.out.println("Processor: " + processor);
        monitors.get(0).print();
        monitors.get(1).print();
    }
}
