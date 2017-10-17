
import java.util.Scanner;

class Factorial {

    public static void main(String... Strings) {

        int N, factorial = 1;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
