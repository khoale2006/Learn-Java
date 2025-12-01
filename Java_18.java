import java.util.Scanner;

public class Java_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 18 code here.");

        System.out.print("Nhap vao so dien trong thang:  ");
        int soDien = scanner.nextInt();
        double tienDien;
        if (0 <= soDien && soDien <= 100) {
            tienDien = soDien * 1000;
            System.out.println("So tien dien phai tra la: " + tienDien + " VND");
        } else if (soDien > 100) {
            tienDien = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("So tien dien phai tra la: " + tienDien + " VND");
        } else {
            System.out.println("So dien khong hop le.");

        }
        scanner.close();

    }
}
