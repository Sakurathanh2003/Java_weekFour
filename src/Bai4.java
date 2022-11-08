import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.trim();
        a = a.toLowerCase();

        boolean space = true;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                continue;
            }
            if (a.charAt(i) == ' ' && space) continue;
            if (a.charAt(i) == ' ' && !space) {
                space = true;
                System.out.print(a.charAt(i));
                continue;
            }

            if (space) {
                System.out.print(a.toUpperCase().charAt(i));
            } else {
                System.out.print(a.charAt(i));
            }

            space = false;
        }
    }
}
