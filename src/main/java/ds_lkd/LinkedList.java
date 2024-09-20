package ds_lkd;

public class LinkedList<T> {
    // Thuoc tinh
    // Trỏ vào vị trí đầu danh sách
    private Node<T> head;
    private int size = 0;

    public LinkedList() {
        this.head = null;
    }

    // Thêm phần tử vào cuối DS liên kết
    public void insertAtEnd(T t) {
        // B1: Tao node
        Node tmp = new Node(t);
        // B2: them
        if (head == null) {
            head = tmp;
            size++;
            return;
        }
        // Nguoc lai: tim ra node cuoi cung
        // Node cuối có next = null
        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(tmp);
        size++;
    }

    // Them vao dau danh sach
    public void insertAtBegin(T t) {
        // B1: tao node
        Node tmp = new Node(t);
        //  B2: them
        if (head == null) {
            head = tmp;
            size++;
            return;
        }
        // Co phan tu
        // Trỏ tmp -> head hiện tại
        tmp.setNext(head);
        // Đặt head -> tmp (lúc này tmp thành head mới)
        head = tmp;
        size++;
    }

    // Xoa phan tu o dau danh sach
    public void removeAtBegin() {
        // TH1: khong co phan tu nao
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        // Chi co 1 phan tu
        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }
        // Co nhieu hon 1 phan tu
        Node newHead = head.getNext();
        // Bo lien ket
        head.setNext(null);
        // Gan head = new Head
        head = newHead;
        size--;
    }

    public void removeAtEnd() {
        // TH1: khong co phan tu nao
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        // Chi co 1 phan tu
        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }
        // TH3: co tu 2 phan tu tro len
        Node node = head;
        while (node.getNext().getNext() != null) {
            node = node.getNext();
        }
        node.setNext(null);
        size--;
    }

    public int size() {
        return size;
    }

    // Phuong thuc in ra linked list
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
}
