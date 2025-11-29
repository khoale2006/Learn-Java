import java.util.Scanner;

public class Java_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // In menu ra màn hình
        System.out.println(">> LUA CHON TINH NANG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. CONG              |");
        System.out.println("| 2. TRU               |");
        System.out.println("| 3. NHAN              |");
        System.out.println("++ ------------------ ++");

        // BẮT ĐẦU VÒNG LẶP
        while (true) {
            System.out.print("Nhap vao phim 1, 2 hoac 3 (So khac de thoat): ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("-> BAN DA LUA CHON PHEP CONG ");
                    break; // Thoát khỏi switch, quay lại đầu vòng lặp while
                case 2:
                    System.out.println("-> BAN DA LUA CHON PHEP TRU ");
                    break; // Thoát khỏi switch, quay lại đầu vòng lặp while
                case 3:
                    System.out.println("-> BAN DA LUA CHON PHEP NHAN ");
                    break; // Thoát khỏi switch, quay lại đầu vòng lặp while
                default:
                    System.out.println("-> BAN DA LUA CHON THOAT CHUONG TRINH ");
                    // Lệnh này sẽ tắt hẳn chương trình ngay lập tức
                    System.exit(0);
            }

        }

        // scanner.close() không bao giờ chạy tới được do System.exit(0) nhưng không sao
        // trong bài tập nhỏ này.
    }
}