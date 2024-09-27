package buoi7;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new SinglyLinkedList<>();

        // Danh sach ban dau
        linkedList.insertAtBegin(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);

        // In ra
        linkedList.display();
        // Them 4 vao index = 1
        linkedList.insertAtPosition(1, 4);
        linkedList.insertAtPosition(0, 5);
        linkedList.insertAtPosition(5, 6);
        linkedList.display();

        // Xoa phan tu dau
        int begin = linkedList.deleteAtBegin();
        System.out.println("Begin: " + begin);
        linkedList.display();

        begin = linkedList.deleteAtBegin();
        System.out.println("Begin: " + begin);
        linkedList.display();

        // Xoa cuoi
        int last = linkedList.deleteAtEnd();
        System.out.println("Last: " + last);
        linkedList.display();

        // Xoa theo position
        int deleteData = linkedList.deleteAtPosition(1);
        System.out.println("Delete: " + deleteData);
        linkedList.display();


    }
}
