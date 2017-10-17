
import java.util.Scanner;

public class RoyAndProfilePicture {

    public static void main(String[] args) {
        long L = 0, N = 0, W = 0, H = 0;
        Scanner input = new Scanner(System.in);
        L = input.nextInt();
        N = input.nextInt();
        for (int i = 0; i < N; i++) {
            W = input.nextInt();
            H = input.nextInt();

            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } else {
                if ((W == L && H == L) || ((W > L && H > L) && W == H)) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }

        }

    }

}
