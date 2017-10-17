
import java.util.Scanner;

public class CountDivisors {

    public static void main(String[] args) {
        int count = 0;
        Scanner dato = new Scanner(System.in);

        int l = dato.nextInt();
        int r = dato.nextInt();
        int k = dato.nextInt();

        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
