package buoi4.stack_adt;


public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new StackArray<>(100);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
//        stack1.display();
        System.out.println(stack1.pop());
//        stack1.display();

        Stack<String> stack2 = new StackArray<>(10);
        stack2.push("Hello");
        stack2.push("World");
        stack2.push("Java");
//        stack2.display();

        Stack<Stack> stack3 = new StackArray<>(10);
        stack3.push(stack1);
        stack3.push(stack2);

        System.out.println(stack3);

    }
}
