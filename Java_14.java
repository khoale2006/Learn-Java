import java.util.Scanner;

public class Java_14 {
    public static void main(String[] args) {
        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. CONG |");
        System.out.println("| 2. TRU |");
        System.out.println("| 3. NHAN |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);

        System.out.println("LUA CHON CUA BAN LA : ");
        System.out.println("Java 14 code here.");
        System.out.println("Nhap vao 3 phim 1 2 3 tu ban phim: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("BAN DA LUA CHON PHEP CONG ");
        } else if (number == 2) {
            System.out.println("BAN DA LUA CHON PHEP TRU ");
        } else if (number == 3) {
            System.out.println("BAN DA LUA CHON PHEP NHAN ");
        } else {
            System.out.println("BAN DA LUA CHON THOAT CHUONG TRINH ");
            System.exit(0);
        }

        scanner.close();
    }
}
