package buoi2.hangdoi_photo;

public class PrinterQueue {
    // Thuộc tính
    private int capacity;
    private int front = -1;
    private int rear = -1;
    private Document[] items;

    // Phuong thuc khoi tao
    public PrinterQueue(int capacity) {
        this.capacity = capacity;
        // Khoi tao mang
        this.items = new Document[capacity];
    }

    // Full
    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    // Enqueue - thêm vào cuối
    public void enqueue(Document e) {
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy!");
        }
        if (front == -1) {
            front = 0; // Chi ap dung: phan tu dau tien
        }
        rear++;
        // Gan gia tri vi tri rear = e
        items[rear] = e;
    }

    // Dequeue - lay phan tu dau hang doi
    public Document dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        Document head = items[front]; // Dau hang doi
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return head;
    }

    // Peek()
    public Document peek() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng!");
        }
        return items[front]; // Dau hang doi
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i] + "<--");
        }
        System.out.println();
    }
}
