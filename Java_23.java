import java.util.Scanner;

public class Java_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 23 code here.");

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
        scanner.close();

    }
}
