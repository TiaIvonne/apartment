

public class Apartment
{
    // instance variables - replace the example below with your own
    private String address;
    private int floorNumber;
    private double price;

 
    public Apartment(String add, int floorN, double pric)
    {
        address = add;
        floorNumber = floorN;
        price = pric;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public int getFloorNumber()
    {
        return floorNumber;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setAddress (String newAddress)
    {
        address = newAddress;
    }
    
    public void setFloorNumber (int newFloor)
    {
        floorNumber = newFloor;
    }
        
   public void setPrice( double newPrice)
   {
       price = newPrice;
    }
    

}
