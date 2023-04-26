import java.util.ArrayList;
import java.util.List;

public class FruitList {
    List<Fruit> fruits = new ArrayList<Fruit>();

    public FruitList(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public Fruit searchFruit(String name) {
        for (Fruit fruit : fruits) {
            if (fruit.name.equals(name)) {
                return fruit;
            }
        }
        return null;
    }
    
    public void editFruitQuantity(String name, int quantity) {
        Fruit fruit = searchFruit(name);
        if (fruit != null) {
            fruit.setQuantity(quantity);
        }
    }

    public double calculateEarnings() {
        double earnings = 0;
        for (Fruit fruit : fruits) {
            earnings += fruit.calculatePrice();
        }
        return earnings;
    }

    public void displayFruits() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " " + fruit.price + " " + fruit.quantity);
        }
    }
}
