public abstract class Product 
{
    protected String name;
    protected double price;
    protected int quantity;
    protected boolean isExpired;

    public Product(String name, double price, int quantity, boolean isExpired) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isExpired = isExpired;
    }

    public String getName()
    { 
        return name; 
    }
    public double getPrice()
    { 
        return price; 
    }
    public int getQuantity()
    { 
        return quantity; 
    }
    public boolean isExpired() 
    { 
        return isExpired; 
    }

    public void reduceQuantity(int qty) 
    {
        this.quantity -= qty;
    }

    public abstract boolean requiresShipping();
    public abstract boolean req_shipping();
}