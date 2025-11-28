import java.util.Scanner;

public class Java_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Long side: ");
        String longSide = scanner.nextLine();
        System.out.println("Short side: ");
        int shortSide = scanner.nextInt();

        System.out.println("Chu vi hinh chu nhat: " + (2 * (Integer.parseInt(longSide) + shortSide)));
        System.out.println("Dien tich hinh chu nhat: " + (Integer.parseInt(longSide) * shortSide));
        System.out.println("Canh nho nhat: " + Math.min(Integer.parseInt(longSide), shortSide));

        scanner.close();
    }
}