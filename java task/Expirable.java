public class Expirable extends Product implements Shippable 
{
    private String expirationDate;
    private double weight;

    public Expirable(String name, double price, int quantity, boolean isExpired, String expirationDate, double weight) 
    {
        super(name, price, quantity, isExpired); // Call the constructor of the Product class
        this.expirationDate = expirationDate; // Initialize the new field
        this.weight = weight;
    }

    public String getExpirationDate() 
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) 
    {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean requiresShipping() 
    {  
        return true;
    }

    
    @Override
    public boolean req_shipping() 
    {
        return true;
    }

    @Override
    public double getWeight() 
    {
        return weight;
    }
}