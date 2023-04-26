import java.nio.ShortBuffer;
import java.util.Scanner;
public class FruitShop {
    FruitList inventory;

    public FruitShop(FruitList inventory) {
        this.inventory = inventory;
    }

    public void manageShopOperations() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. ADD");
            System.out.println("2. EDIT");
            System.out.println("3. SEARCH");
            System.out.println("4. SHOW FRUITS");
            System.out.println("5. EARNINGS");

            System.out.println("--------------------");
            System.out.print("Enter operation: ");
            String operation = scanner.next();
            System.out.println("--------------------");

            if (operation.equals("add") || operation.equals("Add") || operation.equals("ADD") || operation.equals("1")) {
                System.out.print("Enter fruit name: ");
                String name = scanner.next();
                System.out.print("Enter fruit price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter fruit quantity: ");
                int quantity = scanner.nextInt();

                Fruit fruit = new Fruit(name, price, quantity);
                inventory.addFruit(fruit);

                System.out.print("------------------------------\n" + name + " Added to Fruits List" + "\n------------------------------\n");
            }
            else if (operation.equals("edit") || operation.equals("Edit") || operation.equals("EDIT") || operation.equals("2")) {
                System.out.print("Enter fruit name: ");
                String name = scanner.next();
                System.out.print("Enter new fruit quantity: ");
                int quantity = scanner.nextInt();

                inventory.editFruitQuantity(name, quantity);

                System.out.println("------------------------------\n" + "Quantity For " + name + " updated tp " + quantity + "\n------------------------------\n");
            }
            else if (operation.equals("search") || operation.equals("Search") || operation.equals("SEARCH") || operation.equals("3")) {
                System.out.println("--------------------");
                System.out.print("Enter fruit name: ");
                String name = scanner.next();
                System.out.println("--------------------");

                Fruit fruit = inventory.searchFruit(name);
                if (fruit != null) {
                    System.out.println("Fruit Name: " + fruit.name + "\n" + "Fruit Price: " + fruit.price + "\n" + "Fruit Quantity: " + fruit.quantity);
                }
                else {
                    System.out.print("Fruit not found.");
                }
            }
            else if ( operation.equals("show") || operation.equals("Show") || operation.equals("SHOW") || operation.equals("4")) {
                if (inventory.fruits.size() == 0) {
                    System.out.print("\nNo fruits in the list.\n\n");
                } else {
                    inventory.displayFruits();
                }
            }
            else if (operation.equals("earnings") || operation.equals("Earnings") || operation.equals("EARNINGS") || operation.equals("5")) {
                double earnings = inventory.calculateEarnings();
                System.out.print("Total earnings: " + earnings + "\n");
            }
            else {
                System.out.print("Invalid operation.\n");
            }
        }
    }
}
