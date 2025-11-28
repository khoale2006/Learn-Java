import java.util.Scanner;

public class Java_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student's name: ");
        String studentName = scanner.nextLine();
        System.out.println("Student's mark: ");
        int studentMark = scanner.nextInt();

        System.out.println(studentName + " has mark : " + studentMark);

        scanner.close();
    }
}