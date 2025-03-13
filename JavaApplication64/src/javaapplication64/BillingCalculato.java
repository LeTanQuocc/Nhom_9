import java.util.Scanner;

public class BillingCalculato {
    public static void main(String[] args) {
        // Nhập loại dịch vụ
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập loại dịch vụ
            System.out.println("Chọn dịch vụ tính tiền (1 - Điện, 2 - Nước): ");
            int serviceType = scanner.nextInt();
            
            // Nhập chỉ số đầu và cuối
            System.out.print("Nhập chỉ số đầu: ");
            double startReading = scanner.nextDouble();
            
            System.out.print("Nhập chỉ số cuối: ");
            double endReading = scanner.nextDouble();
            
            // Kiểm tra chỉ số hợp lệ
            if (endReading < startReading) {
                System.out.println("Lỗi: Chỉ số cuối phải lớn hơn chỉ số đầu.");
                return;
            }
            
            // Tính số tiêu thụ
            double consumption = endReading - startReading;
            double pricePerUnit = 0;
            String serviceName = "";
            
            // Định nghĩa đơn giá
            switch (serviceType) {
                case 1 -> {
                    serviceName = "Điện";
                    pricePerUnit = 3000; // Đơn giá điện (đồng/kWh)
                }
                case 2 -> {
                    serviceName = "Nước";
                    pricePerUnit = 10000; // Đơn giá nước (đồng/m³)
                }
                default -> {
                    System.out.println("Dịch vụ không hợp lệ!");
                    return;
                }
            }
            
            // Tính tiền
            double totalPrice = consumption * pricePerUnit;
            
            // Hiển thị kết quả
            System.out.println("Dịch vụ: " + serviceName);
            System.out.println("Số tiêu thụ: " + consumption + (serviceType == 1 ? " kWh" : " m³"));
            System.out.println("Tổng tiền: " + totalPrice + " VND");
        }
    }
}
