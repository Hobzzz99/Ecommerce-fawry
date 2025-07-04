public class Cartitem 
{
    Product product;
    int quantity;

    public Cartitem(Product product, int quantity) 
    {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() 
    {
        return product.getPrice() * quantity;
    }

    public Product getProduct() 
    {
        return product;
    }

    public int getQuantity() 
    {
        return quantity;
    }    
}
