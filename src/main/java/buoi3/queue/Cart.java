package buoi3.queue;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private List<CartItem> items;

    public Cart(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void payment() {
        System.out.println("Mã: " + id);
        System.out.printf("%-10s %-20s %-10s %-20s %-10s\n", "SP", "Tên sản phẩm", "Giá", "Số lượng", "Thành tiền");
        int totalAmount = 0;
        for (int i = 0; i < items.size(); i++) {
            CartItem cartItem = items.get(i);
            Product product = cartItem.getProduct();
            int quantity = cartItem.getQuantity();
            int amount = quantity * product.getPrice();
            totalAmount += amount;
            System.out.printf("%-10d %-20s %-10d %-20d %-10d\n", product.getId(), product.getName(), product.getPrice(), quantity, amount);
        }
        System.out.printf("Tổng tiền: %d\n\n", totalAmount);
    }
}
