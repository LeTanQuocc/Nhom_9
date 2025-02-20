package quangtam;

import java.util.Scanner;

public class KiemTraTuoiBauCu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap tuoi cua ban: ");
            int tuoi = scanner.nextInt();
            
            if (tuoi >= 18) {
                System.out.println("Ban du tuoi de di bau cu.");
            } else {
                System.out.println("Ban chua du tuoi de di bau cu.");
            }
        }
    }
    
}