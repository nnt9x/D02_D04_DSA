package buoi7;

public class SinglyLinkedList<T> implements LinkedList<T> {
    // Thuộc tinh
    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public void insertAtBegin(T t) {
        // TH1: không có phần tử nào
        Node newNode = new Node(t);
        if (size == 0) {
            this.head = newNode;
            this.size++;
            return;
        }
        // TH2: có nhiều hơn 1 phần tử
        newNode.setNext(this.head);
        this.head = newNode;
        size++;
    }

    @Override
    public void insertAtEnd(T t) {
        // TH1: không có phần tử nào
        Node newNode = new Node(t);
        if (size == 0) {
            this.head = newNode;
            size++;
            return;
        }
        // TH2: cần node cuối: node=>next = null
        Node node = this.head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(newNode);
        size++;
    }

    @Override
    public void insertAtPosition(int position, T t) {
        // TH1: position = 0
        if (position == 0) {
            insertAtBegin(t);
        }
        // TH2: position = size
        else if (position == size) {
            insertAtEnd(t);
        }
        // TH3: position < 0 || postion > size
        else if (position < 0 || position > size) {
            throw new RuntimeException("Index out of range");
        } else {
            // TH4: Thêm vị trí giữa, cần tìm position-1 ?
            //  prev : position - 1
            //  curr: position
            Node<T> prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.getNext();
            }
            Node<T> curr = prev.getNext();

            // newNode
            Node<T> newNode = new Node<>(t);

            prev.setNext(newNode);
            newNode.setNext(curr);
            size++;
        }
    }

    @Override
    public T deleteAtBegin() {
        return null;
    }

    @Override
    public T deleteAtEnd() {
        return null;
    }

    @Override
    public T deleteAtPosition(int position) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }
        System.out.println();
    }

    @Override
    public void sorted() {

    }

    @Override
    public int search(T t) {
        return 0;
    }
}
