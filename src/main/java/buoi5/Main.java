package buoi5;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new StackList<>(100);
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.display();
        System.out.println(stack);

        Stack<String> stringStack = new StackList<>(30);
        stringStack.push("hello");
        stringStack.push("world");
        stringStack.display();
        System.out.println(stringStack.pop());
        stringStack.display();
    }
}
