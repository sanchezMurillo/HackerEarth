
//import java.util.*;
//
//public class LifeTheUniverseAndEverything {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNext() && !input.hasNext("42")) {
//            long N = input.nextInt();
//            System.out.println(N);
//
//        }
//
//    }
//
//}
import java.util.*;

class TestClass {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        while (true) {
            int t = in.nextInt();
            if (t != 42) {
                System.out.println(t);
            } else {
                break;
            }
        }
    }
}
