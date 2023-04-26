// make imports
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Fruit> fruits = new ArrayList<Fruit>();

        FruitList inventory = new FruitList(fruits);

        FruitShop fruitShop = new FruitShop(inventory);

        fruitShop.manageShopOperations();
    }
}
