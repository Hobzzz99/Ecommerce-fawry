public class Customer {
    private String name;
    private Address address;
    private double balance;

    public Customer(String name, Address address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public boolean Affordable(double amount) {
        return balance >= amount;
    }

    public void pay(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
