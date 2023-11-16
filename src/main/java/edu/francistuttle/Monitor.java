package edu.francistuttle;

public class Monitor 
{
    String id;
    String manufactor;
    String resolution;

    public Monitor(String newID, String newManu, String newRes)
    {
        id = newID;
        manufactor = newManu;
        resolution = newRes;
    }

    public void print()
    {
        System.out.println("\tMonitor ID: " + id); 
        System.out.println("\tManufactor: " + manufactor); 
        System.out.println("\tResolution: " + resolution); 
    }

}
