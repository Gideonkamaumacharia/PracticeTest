import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Double> prices = new ArrayList<>();

    public void addItem(double price) {
        prices.add(price);
    }

    public void removeItem(int index) {
        if (index >= 0 && index < prices.size()) {
            prices.remove(index);
        }
    }

    public double calculateTotal() {
        double total = 0;

        for (double price : prices) {
            total += price;
        }

        if (total > 100) {
            total = total * 0.9;
        }

        return total;
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(40);
        cart.addItem(30);
        cart.addItem(50);

        cart.removeItem(1);

        double totalPrice = cart.calculateTotal();
        System.out.println("Total price: " + totalPrice);
    }
}
