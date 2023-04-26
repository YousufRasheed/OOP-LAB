public class WeightedFruit extends Fruit {
    double weight;

    public WeightedFruit(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }
}
