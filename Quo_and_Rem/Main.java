
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] q = new int[n];
            int[] r = new int[n];

            for (int i = 0; i < n; i++) {
                q[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                r[i] = sc.nextInt();
            }
            Arrays.sort(q);
            Arrays.sort(r);
            for (int i = 0; i < n / 2; i++) {
                int temp = r[i];
                r[i] = r[n - 1 - i];
                r[n - 1 - i] = temp;
            }
            int qi = 0, ri = 0, ans = 0;
            while (qi < n && ri < n) {
                long y =(long)r[ri] + 1;
                long x =(long) q[qi] * y + r[ri];
                if (x <= k) {
                    ans++;
                    ri++;
                    qi++;
                } else {
                    ri++;
                }
            }
            System.out.println(ans);

        }
    }
}
