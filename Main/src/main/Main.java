import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số thứ nhất: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Nhập số thứ hai: ");
            double num2 = scanner.nextDouble();
            
            double sum = num1 + num2;
            System.out.println("Tổng hai số là: " + sum);
        }
    }
}
    

