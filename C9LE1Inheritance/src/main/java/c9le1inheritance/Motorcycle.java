package c9le1inheritance;

/**
 * Motorcycle class extends the vehicle class and adds a chain length parameter
 * It also adds a method to push throttle and pop a wheelie 
 * @author Califf McBride CSPC 5000 No Due Date 3-30-2022
 */
public class Motorcycle extends Vehicle 
{
    private int chainLength;
    
    public Motorcycle(String make , String model)
    {
        super (make , model);//Passes in make and model to the vehicle contructor 
        //setChainLength(40); //Sets a default chain length 
    }
    
    public void setChainLength(int chainlength)
    {
        this.chainLength = chainlength;
    }
    
    public int getChainLength ()
    {
        return this.chainLength;
    }
    
    public void pushThrottle()
    {
        System.out.println("Throttle engaged. ");  
    }
    
    public void popWheelie()
    {
        System.out.println("Whoaa...that is a cool wheelie!");
    }
}
