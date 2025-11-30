import java.util.Scanner;

public class Java_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LUA CHON CUA BAN LA : ");
        System.out.println("Java 16 code here.");
        System.out.print("Nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        double b = scanner.nextDouble();

        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem.");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }

        scanner.close();

    }
}
