import java.util.Scanner;

public class Java_12 {
    public static void main(String[] args) {
        System.out.println("Java 12 code here.");
        // - dưới 10M: không đóng thuế
        // - từ 10M tới 15M: thuế 10%
        // - từ 15 tới 30M : thuế 20%
        // - trên 30M: thuế 50%
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thu nhap hang thang: ");
        double thuNhap = scanner.nextDouble();
        double thue = 0;
        if (thuNhap < 10000000) {
            System.out.println("Khong dong thue " + thue);
        } else if (thuNhap >= 10000000 && thuNhap < 15000000) {
            System.out.println("Dong thue 10%: " + (thue = thuNhap * 0.10));
        } else if (thuNhap >= 15000000 && thuNhap < 30000000) {
            System.out.println("Dong thue 20%: " + (thue = thuNhap * 0.20));
        } else {
            System.out.println("Dong thue 50%: " + (thue = thuNhap * 0.50));
        }
        scanner.close();
    }
}
