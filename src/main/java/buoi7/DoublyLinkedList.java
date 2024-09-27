package buoi7;

public class DoublyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void insertAtBegin(T t) {
        Node<T> tmp = new Node<>(t);
        if (size == 0) {
            head = tmp;
            size++;
            return;
        }
        tmp.setNext(head);
        head.setPrev(tmp);
        head = tmp;
        size++;
    }

    @Override
    public void insertAtEnd(T t) {

    }

    @Override
    public void insertAtPosition(int position, T t) {

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
        return 0;
    }

    @Override
    public void display() {
        if (head == null) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + "<-->");
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
