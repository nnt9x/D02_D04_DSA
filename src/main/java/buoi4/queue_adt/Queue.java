package buoi4.queue_adt;

public interface Queue<T> {
    public boolean enqueue(T t);

    public T dequeue();

    public T peek();

    public boolean isEmpty();

    public boolean isFull();

    public String toString();
}
