
import java.util.Arrays;

public class Java_21 {

    public static void main(String[] args) {
        System.out.println("Java 21 code here.");
        int[] clubs = { 3, 5, 8, 1, 4 };

        for (int i = 0; i < clubs.length - 1; i++) {
            for (int j = i + 1; j < clubs.length; j++) {
                if (clubs[i] > clubs[j]) {
                    int temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(clubs));
    }
}
