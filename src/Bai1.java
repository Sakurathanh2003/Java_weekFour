import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            char kitu = a.charAt(i);
            if (kitu == ' ') continue;
            int dem = 0;
            int batdau = 0;

            while (a.indexOf(kitu, batdau) != -1) {
                batdau = a.indexOf(kitu, batdau) + 1;
                dem++;
            }

            System.out.println(kitu + ": " + dem);
            a = a.replace(kitu, ' ');
        }
    }
}
