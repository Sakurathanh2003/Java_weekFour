import java.util.Scanner;
import java.lang.String;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int dem = 0;
        int so = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                dem += a.charAt(i) - '0';
                so++;
            }
        }

        if (dem == 0) {
            System.out.print("false");
            return;
        }

        double ans = (double)dem / so;
        ans = lamtron(ans);

        System.out.println("true");
        System.out.print(ans);
    }

    public static double lamtron(double a) {
        a = a * 1000;
        a = Math.round(a);
        a = a / 1000;
        return a;
    }
}
