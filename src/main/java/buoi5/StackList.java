package buoi5;

import java.util.ArrayList;
import java.util.List;

public class StackList<T> implements Stack<T> {
    // Thuoc tinh
    private int capacity;
    private List<T> items;

    // Phuong thuc khoi tao
    public StackList(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        items.add(t);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T tmp = items.get(size() - 1);
        items.remove(size() - 1);
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.get(size() - 1);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (items.size() == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: \n");
        for (int i = size() - 1; i >= 0; i--) {
            builder.append(items.get(i) + "\n");
        }
        return builder.toString();
    }

    @Override
    public void display() {
        System.out.println(toString());
    }
}
