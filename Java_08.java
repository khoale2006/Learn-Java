import java.util.Scanner;

public class Java_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Long side: ");
        int longSide = scanner.nextInt();
        System.out.println("Short side: ");
        int shortSide = scanner.nextInt();

        System.out.println("Chu vi hinh chu nhat: " + (2 * (longSide + shortSide)));
        System.out.println("Dien tich hinh chu nhat: " + (longSide * shortSide));
        System.out.println("Canh nho nhat: " + Math.min(longSide, shortSide));
        scanner.close();
    }
}