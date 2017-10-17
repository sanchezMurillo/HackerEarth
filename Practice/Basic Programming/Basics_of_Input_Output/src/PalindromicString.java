
import java.util.*;

class PalindromicString {

    public static void main(String args[]) throws Exception {

        String s, reverse = "";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        StringBuilder S = new StringBuilder(s);
        StringBuilder palindromic = S.reverse();
        reverse += palindromic;

        if (reverse.equalsIgnoreCase(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}