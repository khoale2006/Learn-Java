import java.util.Scanner;

public class Java_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: " + Math.sqrt(49));
        int firstnumber = scanner.nextInt();
        System.out.println("Second number: ");
        int secondnumber = scanner.nextInt();
        if (firstnumber == secondnumber) {
            System.out.println("không có số lớn nhất");
        } else {
            System.out.println("Max value is: " + Math.max(firstnumber, secondnumber));
        }
        scanner.close();
    }
}
