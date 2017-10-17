
import java.util.Scanner;

public class SeatingArrangement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long T = input.nextLong();
        String[] Array = new String[13];
        Array[1] = Array[6] = Array[7] = Array[12] = "WS";
        Array[2] = Array[5] = Array[8] = Array[11] = "MS";
        Array[3] = Array[4] = Array[9] = Array[10] = "AS";

        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            if (N % 12 == 0) {
                System.out.println((N - 11) + " " + Array[1]);
            } else {
                System.out.println(((N / 12) * 12 + (13 - N % 12)) + " " + Array[(13 - N % 12)]);
            }

        }
    }

}
