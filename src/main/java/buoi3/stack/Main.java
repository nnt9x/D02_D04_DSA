package buoi3.stack;

public class Main {
    public static void main(String[] args) {
        StackNumber stackNumber = new StackNumber(10);

        stackNumber.push(10);
        stackNumber.push(30);
        stackNumber.push(20);
        stackNumber.push(50);

        stackNumber.display();
        // Thuc hien pop
        System.out.println("Top: "+ stackNumber.pop());
        stackNumber.display();

        System.out.println("Top: "+ stackNumber.pop());
        stackNumber.display();

        stackNumber.push(60);
        stackNumber.display();

    }
}
