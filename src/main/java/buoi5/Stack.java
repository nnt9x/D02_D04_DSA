package buoi5;

public interface Stack<T> {
    void push(T t);

    T pop();

    T peek();

    int size();

    boolean isFull();

    boolean isEmpty();

    String toString();

    void display();
}
