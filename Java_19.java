import java.util.Scanner;

public class Java_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 19 code here.");

        System.out.println(">> LUA CHON TINH NANG  <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. GIAI PT BAT NHAT |");
        System.out.println("| 2. GIAI PT BAC HAI |");
        System.out.println("| 3. TINH SO TIEN DIEN |");
        System.out.println("| 4. KET THUC |");
        System.out.println("++ ------------------ ++");

        while (true) {

            System.out.print("Nhap vao lua chon cua ban (1-4): ");
            int choice = scanner.nextInt();

            // Giải PT bậc nhất

            if (choice == 1) {
                System.out.print("Nhap vao a: ");
                double a = scanner.nextDouble();
                System.out.print("Nhap vao b: ");
                double b = scanner.nextDouble();
                System.out.printf("GIAI PT BAT NHAT %dx + %d = 0 \n", a, b);

                if (a == 0 && b == 0) {
                    System.out.println("Phuong trinh vo so nghiem.");
                } else if (a == 0 && b != 0) {
                    System.out.println("Phuong trinh vo nghiem.");
                } else {
                    double x = -b / a;
                    System.out.println("Phuong trinh co nghiem x = " + x);
                }

                // Giải PT bật hai

            } else if (choice == 2) {
                System.out.print("Nhap vao a: ");
                double a = scanner.nextDouble();
                System.out.print("Nhap vao b: ");
                double b = scanner.nextDouble();
                System.out.print("Nhap vao c: ");
                double c = scanner.nextDouble();
                double delta;
                System.out.printf("GIAI PT BAC HAI %dx^2 + %dx + %d = 0 \n", a, b, c);
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

                }

                // Tính số tiền điện

            } else if (choice == 3) {
                System.out.print("Nhap vao so dien tieu thu (kWh): ");
                int soDien = scanner.nextInt();
                double tienDien;
                if (0 <= soDien && soDien <= 100) {
                    tienDien = soDien * 1000;
                } else {
                    tienDien = 100 * 1000 + (soDien - 100) * 1500;
                }
                System.out.println("So tien dien phai tra: " + tienDien + " VND");
            } else if (choice == 4) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            } else {
                System.out.println("LLua chon khong hop le. Vui long thu lai.");

            }

        }

    }
}
