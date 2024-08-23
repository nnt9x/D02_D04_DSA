package buoi2.hangdoi;

public class Main {
    public static void main(String[] args) {
        QueueNumber queue1 = new QueueNumber(10);

        QueueNumber queue2 = new QueueNumber(5);
        // Them phan tu vao hang doi
        queue1.enqueue(10);
        queue1.enqueue(50);
        queue1.enqueue(40);
        queue1.display();
        // Lay phan tu dau hang doi
        System.out.println(queue1.dequeue());
        queue1.display();

        System.out.println(queue1.dequeue());
        queue1.display();

        System.out.println(queue1.dequeue());
        queue1.display();

        System.out.println(queue1.dequeue());
        queue1.display();

    }
}
