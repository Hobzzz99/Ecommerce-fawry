public class Cart {
    private Cartitem[] items = new Cartitem[20]; // initial capacity
    private int size = 0;

    public void add(Product product, int qty) 
    {
        if (product.getQuantity() < qty) 
        {
            System.out.println("Not enough quantity for " + product.getName());
            return;
        }
        // Check for out of stock or expired product before adding to cart
        if (product.getQuantity() == 0) 
        {
            System.err.println("Error: " + product.getName() + " is out of stock.");
            return;
        }
        if (product.isExpired()) 
        {
            System.err.println("Error: " + product.getName() + " is expired and cannot be added to cart.");
            return;
        }

        // Check if the item already exists in the cart to update quantity
        for (int i = 0; i < size; i++) {
            Cartitem item = items[i];
            if (item.getProduct().getName().equals(product.getName())) 
            {
                // If adding more quantity would exceed available, prevent it
                if (item.getQuantity() + qty > product.getQuantity()) 
                {
                     System.err.println("Error: Cannot add " + qty + " more of " + product.getName() + ". Total would exceed available stock.");
                     return;
                }
                items[i] = new Cartitem(item.getProduct(), item.getQuantity() + qty);
                System.out.println(qty + "x " + product.getName() + " added to cart. Total in cart: " + items[i].getQuantity());
                return;
            }
        }
        // If not in cart, add new CartItem
        if (size == items.length) {
            Cartitem[] newItems = new Cartitem[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size++] = new Cartitem(product, qty);
        System.out.println(qty + "x " + product.getName() + " added to cart.");
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Cartitem[] getItems() 
    {
        Cartitem[] result = new Cartitem[size];
        System.arraycopy(items, 0, result, 0, size);
        return result;
    }

    public double getSubtotal() 
    {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }

    public double getShippingFees() 
    {
        double weight = 0;
        for (int i = 0; i < size; i++) {
            Cartitem item = items[i];
            if (item.getProduct().requiresShipping() && item.getProduct() instanceof Shippable) 
            {
                Shippable shipItem = (Shippable) item.getProduct();
                weight += shipItem.getWeight() * item.getQuantity();
            }
        }
        return weight * 10; // 10 EGP/kg
    }

    public Shippable[] getShippableItems() 
    {
        int count = 0;
        for (int i = 0; i < size; i++) {
            Cartitem item = items[i];
            if (item.getProduct().requiresShipping() && item.getProduct() instanceof Shippable) 
            {
                count += item.getQuantity();
            }
        }
        Shippable[] list = new Shippable[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            Cartitem item = items[i];
            if (item.getProduct().requiresShipping() && item.getProduct() instanceof Shippable) 
            {
                for (int j = 0; j < item.getQuantity(); j++) 
                {
                    list[idx++] = (Shippable) item.getProduct();
                }
            }
        }
        return list;
    }

    public void clearCart() 
    {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }
}