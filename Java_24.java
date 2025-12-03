import java.util.Scanner;

public class Java_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 🔁 Lặp lại toàn bộ chương trình
            System.out.println("Java 24 code here.");

            System.out.print("Nhap vao 1 so nguyen bat ky (2-9): ");
            int n = scanner.nextInt();

            while (n < 2 || n > 9) {
                System.out.print("So ban nhap khong hop le. Vui long nhap lai (2-9): ");
                n = scanner.nextInt();
            }

            System.out.printf("Bang cuu chuong cua %d:\n", n);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", n, i, n * i);
            }

            // 🔽 Hỏi người dùng có muốn tiếp tục hay không
            System.out.print("\nNhap 11 de thoat, nhap so bat ky de tiep tuc: ");
            int choice = scanner.nextInt();
            if (choice == 11) {
                System.out.println("Thoat chuong trinh...");
                break; // Thoát khỏi vòng lặp while(true)
            }

            System.out.println(); // xuống dòng cho đẹp
        }

        scanner.close();
    }
}
