package c9le1inheritance;

/**
 *
 * @author calif
 */
public class Car extends Vehicle
{
    private int passengers;
    private boolean moonRoofOpen;
    
    public Car (String make, String model)
    {
       super (make, model);
       this.passengers = 4;
       this.moonRoofOpen = false;
    }
    
    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }
    
    public int getPassengers()
    {
        return this.passengers; 
    }
    
    public void openMoonRoof ()
    {
        moonRoofOpen = true;
        System.out.println("Moon roof open = " + moonRoofOpen);
    }
     
}
