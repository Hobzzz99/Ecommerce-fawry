public class main {
    public static void main(String[] args) 
    {
        Address address = new Address("Cairo", "Main St", "12A", "0123456789");
        Customer customer = new Customer("Ali", address, 500);
        Product cheese = new Expirable("Cheese", 100, 5, false, "2024-12-31", 0.2);
        Product biscuits = new Expirable("Biscuits", 150, 2, false, "2024-12-31", 0.7);
        Product tv = new Nonexpirable("TV", 300, 4, false, true, 2.0);
        Product scratchCard = new Nonexpirable("Scratch Card", 50, 10, false, false, 0);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        checkout(customer, cart);
    }

    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        for (Cartitem item : cart.getItems()) {
            if (item.getProduct().isExpired()) {
                System.out.println("Error: " + item.getProduct().getName() + " is expired.");
                return;
            }
            if (item.getProduct().getQuantity() < item.getQuantity()) {
                System.out.println("Error: Not enough stock for " + item.getProduct().getName());
                return;
            }
        }

        double subtotal = cart.getSubtotal();
        double shipping = cart.getShippingFees();
        double total = subtotal + shipping;

        if (!customer.Affordable(total)) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        for (Cartitem item : cart.getItems()) {
            item.getProduct().reduceQuantity(item.getQuantity());
        }

        customer.pay(total);
        Shipping.ship(cart.getShippableItems());

        System.out.println("** Checkout receipt **");
        for (Cartitem item : cart.getItems()) {
            System.out.printf("%dx %s\t%.0f\n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal\t%.0f\n", subtotal);
        System.out.printf("Shipping\t%.0f\n", shipping);
        System.out.printf("Amount\t\t%.0f\n", total);
        System.out.printf("Customer Balance: %.0f\n", customer.getBalance());
    }
}
