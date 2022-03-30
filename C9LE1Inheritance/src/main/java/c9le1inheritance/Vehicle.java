package c9le1inheritance;

/**
 * This super class models information about a transportation vehicle 
 * @author Califf McBride CSPC5000 No Due Date Completed on 3-30-2022
 */
public class Vehicle 
{
    private String make;
    private String model;
    
    public Vehicle (String make, String model)
    {
        this.make = make;
        this.model = model;
    }
    
    public void setMake (String make)
    {
        this.make = make;
    }
    
    public String getMake()
    {
        return this.make;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return this.model;
    }
    
    public void startEngine()
    {
        System.out.println("Engine is starting.....engine started");
    }
    
    public void openWindow()
    {
        System.out.println("Window is opening.....window is now open");
    }
}
