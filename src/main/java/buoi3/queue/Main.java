package buoi3.queue;

public class Main {
    public static void main(String[] args) {
        // San pham
        Product product1 = new Product(1,"Sản phẩm 1", 1000);
        Product product2 = new Product(2,"Sản phẩm 2", 2000);
        Product product3 = new Product(3,"Sản phẩm 3", 1500);
        Product product4 = new Product(4,"Sản phẩm 4", 3000);
        Product product5 = new Product(5,"Sản phẩm 5", 1800);
        // Tao gio hang
        Cart cart1 = new Cart(1);
        cart1.getItems().add(new CartItem(product1,5));
        cart1.getItems().add(new CartItem(product3,2));
        cart1.getItems().add(new CartItem(product5,1));

        Cart cart2 = new Cart(2);
        cart2.getItems().add(new CartItem(product2,3));
        cart2.getItems().add(new CartItem(product5,5));

        Cart cart3 = new Cart(3);
        cart3.getItems().add(new CartItem(product4,5));
        cart3.getItems().add(new CartItem(product1,1));
        cart3.getItems().add(new CartItem(product5,1));

        // Thanh toan
        QueueCart queueCart = new QueueCart(100);
        queueCart.enqueue(cart3);
        queueCart.enqueue(cart1);
        queueCart.enqueue(cart2);

        // Thanh toan theo thu tu
        while (!queueCart.isEmpty()){
            Cart cart = queueCart.dequeue();
            cart.payment();
        }
    }
}
