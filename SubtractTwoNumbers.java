package thi;
import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        // Tính hiệu
        int difference = a - b;
        
        // Hiển thị kết quả
        System.out.println("Hiệu của " + a + " và " + b + " là: " + difference);
        
        scanner.close();
    }
}
