package buoi3.stack;

public class StackNumber {
    // Thuộc tính
    private int capacity; // Kich thuoc stack
    private int top = -1;
    private int[] items;

    // Phuong thuc khoi tao
    public StackNumber(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    // Cac phep toan
    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Ngăn xếp đã đầy!");
        }
        top = top + 1;
        items[top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Ngăn xếp rỗng!");
        }
        int topElement = items[top];
        // Giam top 1 don vi
        top = top - 1;
        return topElement;
    }

    public void display(){
        System.out.println("Ngăn xếp: ");
        for(int i = top; i >= 0; i--){
            System.out.println(items[i]);
        }
        System.out.println("-----------------------\n");
    }
}
