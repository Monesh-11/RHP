import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        long res = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'C') {
                res += Math.min(i, n - i - 1) + 1;
            }
        }

        System.out.println(res);
    }
}