public class Nonexpirable extends Product
{
    private boolean shipping;
    private double weight;

    public Nonexpirable(String name, double price, int quantity, boolean isExpired, boolean shipping, double weight) 
    {
        super(name, price, quantity, isExpired);
        this.shipping = shipping;
        this.weight = weight;
    }
    
    @Override
    public boolean requiresShipping() 
    { 
        return shipping; 
    }
    @Override
    public boolean req_shipping() 
    { 
        return shipping; 
    }
    public double getWeight() 
    { 
        return weight; 
    }
}
