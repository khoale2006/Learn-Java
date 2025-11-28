import java.util.Scanner;

public class Java_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 canh cua hinh lap phuong: ");
        int canh = scanner.nextInt();
        double theTich = Math.pow(canh, 3);

        System.out.println("The tich cua hinh lap phuong la: " + theTich);

        scanner.close();
    }
}