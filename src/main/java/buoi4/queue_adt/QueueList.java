package buoi4.queue_adt;

import java.util.ArrayList;
import java.util.List;

public class QueueList<T> implements Queue<T> {
    // Thuoc tinh
    private int capacity;
    private List<T> items;

    // Phuong thuc
    public QueueList(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public boolean enqueue(T t) {
        if (isFull()) {
            return false;
        }
        // Them vao cuoi
        items.add(t);
        return true;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T tmp = items.get(0);
        items.remove(0);
        return tmp;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        T tmp = items.get(0);
        return tmp;
    }

    @Override
    public boolean isEmpty() {
        if (items.isEmpty()) return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if (items.size() == capacity) return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty!";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Queue: \n");
        for (int i = 0; i < items.size(); i++) {
            builder.append(items.get(i) + "<--");
        }
        builder.append("\n");
        return builder.toString();
    }
}
