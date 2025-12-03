import java.util.Scanner;

public class Java_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 22 code here.");

        System.out.print("Nhap vao 1 so tu ban phim: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Uoc so khac : " + i);
                count++;
                break;

            }

        }
        if (count == 0) {
            System.out.printf("%d la so nguyen to", n);
        } else {
            System.out.printf("%d khong phai la so nguyen to", n);
        }
        scanner.close();
    }

}
