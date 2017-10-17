
import java.util.Scanner;

class FindProduct {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        long[] A = new long[N];

        long M = 1000000007;
        long answer = 1;

        for (int i = 0; i <= N - 1; i++) {
            A[i] = input.nextLong();
            answer = (answer * A[i]) % M;

        }
        System.out.println(answer);
    }

}
