package ds_lkd;

public class Main {
    public static void main(String[] args) {
        // Node 1->2->3->5->7
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(9);
        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(7);
        linkedList.insertAtBegin(0);
        linkedList.insertAtBegin(-1);

        linkedList.display();
        // Xoa dau ds
        linkedList.removeAtBegin();
        linkedList.display();

        linkedList.removeAtBegin();
        linkedList.display();

        linkedList.removeAtEnd();
        linkedList.display();
        System.out.println("Size:" + linkedList.size());
        linkedList.removeAtEnd();
        linkedList.display();
        linkedList.removeAtEnd();
        linkedList.display();
        linkedList.removeAtEnd();
        linkedList.display();
        linkedList.removeAtEnd();
        linkedList.display();
        linkedList.removeAtEnd();
        linkedList.display();
        // Lay ra kich thuoc
        System.out.println("Size:" + linkedList.size());
    }
}
