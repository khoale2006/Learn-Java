import java.util.Scanner;

public class Java_13 {
    public static void main(String[] args) {
        System.out.println("Java 13 code here.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tu 1 den 7 de biet thu trong tuan: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        scanner.close();
    }
}
