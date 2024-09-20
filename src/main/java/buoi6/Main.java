package buoi6;

public class Main {
    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Lien ket cac node
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        System.out.println();
    }
}
