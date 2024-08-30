package buoi2.hangdoi_photo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Tao hang doi
        PrinterQueue printerQueue = new PrinterQueue(10);
        // Tao ra tai lieu
        Document d1 = new Document(1, "Tài liệu 1: Lập trình Java");
        Document d2 = new Document(2, """
                Cấu trúc dữ liệu và giải thuật
                1. Tổng quan về CTDL, GT
                2. Hàng đợi
                """);
        Document d3 = new Document(3, "Xin chào các bạn");
        // Thêm vào hàng đợi
        printerQueue.enqueue(d3);
        printerQueue.enqueue(d2);
        printerQueue.enqueue(d1);
        // In thu
//        printerQueue.display();
        while (!printerQueue.isEmpty()) {
            Document d = printerQueue.dequeue();
            System.out.println("In tài liệu: " + d.getCode());
            Thread.sleep(4000);
            // Lay noi dung trong d
            String content = d.getContent().toUpperCase();
            System.out.println(content);
            System.out.println("Hoàn thành! \n");
        }
    }
}
