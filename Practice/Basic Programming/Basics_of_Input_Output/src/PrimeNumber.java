
import java.util.*;

class PrimeNumber {

    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 2; i <= N; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont < 3) {
                System.out.print(i + " ");
            }
        }
    }
}
