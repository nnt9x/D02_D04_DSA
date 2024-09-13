package buoi4.queue_adt;

public class Main {
    public static void main(String[] args) {
        // class wrapper
        Queue<Integer> queue1 = new QueueList<>(100);
        queue1.enqueue(10);
        queue1.enqueue(30);
        queue1.enqueue(50);
        System.out.println(queue1);
        System.out.println(queue1.dequeue());
        System.out.println(queue1);


    }
}
