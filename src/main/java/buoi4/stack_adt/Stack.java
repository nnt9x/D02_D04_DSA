package buoi4.stack_adt;

// Generic: Tham số hoá kiểu dữ liệu
public interface Stack <T>{
    public void push(T t);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public boolean isFull();
    public void display();
}
