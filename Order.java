// Order class
import java.util.ArrayList;
import java.util.List;

class Order {
    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotalOrderPrice() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printOrder() {
        for (OrderItem item : items) {
            System.out.println(item.getProduct().getName() + " x " + item.getQuantity() + " = " + item.getTotalPrice());
        }
        System.out.println("Total: " + getTotalOrderPrice());
    }
}
