
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }

        int q = sc.nextInt();
        while (q-- > 0) {
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long r1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();
            long r2 = sc.nextLong();

            long a = (x2 - x1) * (x2 - x1);
            long b = (y2 - y1) * (y2 - y1);
            long c = (r1 + r2) * (r1 + r2);
            long d = (r1 - r2) * (r1 - r2);

            if (a + b <= c && a + b >= d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
