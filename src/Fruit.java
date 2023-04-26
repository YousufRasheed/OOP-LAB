public class Fruit {
    String name;
    double price;
    int quantity;

    // Constructor
    public Fruit(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // get name
    public String getName() {
        return name;
    }

    // get price
    public double getPrice() {
        return price;
    }

    // get quantity
    public int getQuantity() {
        return quantity;
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    // set price
    public void setPrice(double price) {
        this.price = price;
    }

    // set quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calculatePrice() {
        return price * quantity;
    }
}
