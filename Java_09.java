import java.util.Scanner;

public class Java_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 canh: ");
        int canh = scanner.nextInt();

        System.out.println("Volume of cubic is: " + Math.pow(canh, 3));

        scanner.close();
    }
}
