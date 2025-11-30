import java.util.Scanner;

public class Java_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 17 code here.");

        System.out.print("Nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao c: ");
        double c = scanner.nextDouble();
        double delta;
        if (a == 0) {
            System.out.println("He so phai khac 0.");

        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem. ");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);

            }
            scanner.close();

        }

    }

}
