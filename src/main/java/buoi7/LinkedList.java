package buoi7;

public interface LinkedList <T>{
    // Thêm
    void insertAtBegin(T t);
    void insertAtEnd(T t);
    void insertAtPosition(int position, T t);
    // Xoá
    T deleteAtBegin();
    T deleteAtEnd();
    T deleteAtPosition(int position);

    // Kích thước
    int size();
    void display();

    // Sắp xếp
    void sorted();
    // Tìm kiếm và trả về vị trí
    int search(T t);
}
