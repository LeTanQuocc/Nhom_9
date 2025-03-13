
package javaapplication48;

import java.util.Scanner;

public class JavaApplication47 {
    void kiemtra(){
         Scanner scanner = new Scanner(System.in);
        

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        
        if (b != 0) {
            if (a % b == 0) {
                System.out.println(a + " chia hết cho " + b);
            } else {
                System.out.println(a + " không chia hết cho " + b);
            }
        } else {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }
        
        scanner.close();
    }
    void chia2so(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        
        
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Kết quả của " + num1 + " chia cho " + num2 + " là: " + result);
        } else {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }
        
        
        scanner.close();
       
    }
    void tinhthanhtien(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Nhập đơn giá: ");
        double price = scanner.nextDouble();

        double total = quantity * price;
        
        System.out.println("Thành tiền: " + total);
        
        scanner.close();
    }
    void donghonuoc(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số đầu của đồng hồ nước: ");
        int startReading = scanner.nextInt();
        
        System.out.print("Nhập số cuối của đồng hồ nước: ");
        int endReading = scanner.nextInt();
        
        if (endReading >= startReading) {
            int waterUsage = endReading - startReading;
            
            System.out.print("Nhập đơn giá nước trên mỗi m³: ");
            double pricePerUnit = scanner.nextDouble();
            
            double total = waterUsage * pricePerUnit;

            System.out.println("Lượng nước tiêu thụ: " + waterUsage + " m³");
            System.out.println("Thành tiền: " + total + " VND");
        } else {
            System.out.println("Lỗi: Số cuối phải lớn hơn hoặc bằng số đầu!");
        }
        
        scanner.close();
    }
}
