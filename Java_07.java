
// Java_07 chuyển đổi tử kiểu String sang int sử dụng Integer.parseInt()
import java.util.Scanner;

public class Java_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Long side: ");
        String longSide = scanner.nextLine();
        System.out.println("Short side: ");
        String shortSide = scanner.nextLine();

        System.out.println("Chu vi hinh chu nhat: " + (2 * (Integer.parseInt(longSide) + Integer.parseInt(shortSide))));
        System.out.println("Dien tich hinh chu nhat: " + (Integer.parseInt(longSide) * Integer.parseInt(shortSide)));
        System.out.println("Canh nho nhat: " + Math.min(Integer.parseInt(longSide), Integer.parseInt(shortSide)));
        scanner.close();
    }
}