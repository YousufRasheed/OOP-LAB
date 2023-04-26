public class CountedFruit extends Fruit {
    int count;
    
    public CountedFruit(String name, double price, int quantity, int count) {
        super(name, price, quantity);
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
