package buoi1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Định nghĩa mảng
        float arr[] = new float[10];
        // Bước 2: Nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            // Tại mỗi lần lặp: gán giá trị
            // arr[1] =
            System.out.printf("arr[%d] = ",i);
            arr[i] = scanner.nextFloat();
        }
        scanner.close();
        // Bước 3: in ra thử mảng vừa nhập
        System.out.println("Mảng vừa nhập: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d] = %.2f\n",i,arr[i]);
        }
        // a. In ra tổng các giá trị trong mảng.
        double total = 0;
        for(float num : arr)
            total += num;
        System.out.println("tong cac gia tri la " + total);

        //B2
        System.out.println("Trung binh cong: " + total / arr.length);

        // c.
        double max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max : " + max);
    }
}
