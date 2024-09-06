// Main class to test the system
public class ShopOrderingSystem {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 0.5);
        Product banana = new Product("Banana", 0.2);

        OrderItem item1 = new OrderItem(apple, 10);
        OrderItem item2 = new OrderItem(banana, 5);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);

        order.printOrder();
    }
}
