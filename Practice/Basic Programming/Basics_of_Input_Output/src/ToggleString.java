
import java.util.*;

class ToggleString {

    public static void main(String args[]) {
        Scanner dato = new Scanner(System.in);
        String frase = dato.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (Character.isUpperCase(letra)) {
                letra = Character.toLowerCase(letra);
            } else {
                letra = Character.toUpperCase(letra);
            }

            System.out.print(letra);
        }
    }
}
