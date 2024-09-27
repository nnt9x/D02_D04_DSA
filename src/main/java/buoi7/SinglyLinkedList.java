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
        if (size == 0) {
            throw new RuntimeException("Linked list is empty");
        }
        T data = null;

        if (size == 1) {
            data = head.getData();
            head = null;
            size--;
        } else {
            // Có ít nhất 2 phần tử
            Node<T> newHead = head.getNext();
            // Lay du lieu
            data = head.getData();
            // setnext head -> null
            head.setNext(null);
            head = newHead;
            size--;
        }
        return data;
    }

    @Override
    public T deleteAtEnd() {
        if (size == 0) {
            throw new RuntimeException("Linkedlist is empty");
        } else if (size == 1) {
            return deleteAtBegin();
        } else {
            // Xoa phan tu cuoi
            Node<T> tmp = head; // tmp: node gần cuối
            while (tmp.getNext().getNext() != null) {
                tmp = tmp.getNext();
            }
            // Node cuoi
            Node<T> lastNode = tmp.getNext();
            // Xoa lien ket
            tmp.setNext(null);
            // Giam size
            size--;
            return lastNode.getData();
        }
    }

    @Override
    public T deleteAtPosition(int position) {
        // TH1: 
        if (position == 0) {
            return deleteAtBegin();
        } else if (position == size - 1) {
            return deleteAtEnd();
        } else if (position < 0 || position >= size) {
            throw new RuntimeException("Index out of range");
        } else {
            // Xoa:
            // position - 1: prev
            // position: curr
            // position + 1: next

            Node<T> prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.getNext();
            }
            Node<T> curr = prev.getNext();
            Node<T> next = curr.getNext();

            prev.setNext(next);
            curr.setNext(null);
            size--;
            return curr.getData();
        }
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
