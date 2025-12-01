import java.util.Scanner;

public class Java_20 {
    public static void giaiptbatnhat() {
        System.out.println("<<LUA CHON TINH NANG 1:>>");
        Scanner scanner = new Scanner(System.in);
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
            System.out.printf("Phuong trinh co nghiem = %.3f", x);
        }
    }

    public static void giaiptbachai() {
        System.out.println("<<LUA CHON TINH NANG 2:>>");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao c: ");
        double c = scanner.nextDouble();
        double delta;
        if (a == 0) {
            // Giải như PT bật nhất
            if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else {
                double x = -c / b;
                System.out.printf("Phuong trinh co nghiem = %.3f", x);
            }

        } else {
            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem. ");
            } else if (delta == 0) {
                System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.3f", (-b / (2 * a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet: x1 = %.3f, x2 = %.3f", x1, x2);
            }

        }
    }

    public static void tinhSotienDien() {
        System.out.println("<<LUA CHON TINH NANG 3:>>");
        Scanner scanner = new Scanner(System.in);
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 20 code here.");
        while (true) {

            System.out.println(">> LUA CHON TINH NANG  <<");
            System.out.println("++ ----------------------------------------- ++");
            System.out.println("| 1. GIAI PT BAT NHAT                        |");
            System.out.println("| 2. GIAI PT BAC HAI                         |");
            System.out.println("| 3. TINH SO TIEN DIEN                       |");
            System.out.println("| 4. KET THUC                                 |");
            System.out.println("++ ----------------------------------------- ++");
            System.out.print("Nhap vao lua chon cua ban (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiptbatnhat();
                    break;
                case 2:
                    giaiptbachai();
                    break;
                case 3:
                    tinhSotienDien();
                    break;
                case 4:
                    System.out.println("KET THUC CHUONG TRINH.");
                    scanner.close();
                    return; // Thoát khỏi hàm main
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }

            System.out.println(); // Xuống dòng cho đẹp
        }
    }
}
