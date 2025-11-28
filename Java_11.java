import java.util.Scanner;

public class Java_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao diem cua sinh vien: ");
        double diem = scanner.nextDouble();
        if (diem > 5) {
            System.out.println("Sinh vien da duoc qua mon");
        } else {
            System.out.println("Sinh vien chua duoc qua mon");
        }
        System.out.println("run here " + (diem > 5));
        scanner.close();
    }
}
