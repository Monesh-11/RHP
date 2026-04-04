import java.util.*;

public class Main {
    public static char[] arr;
    public static String t;
    public static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        t = sc.nextLine();

        arr = s.toCharArray();

        dfs("", 0);

        System.out.println(res);
    }

    public static void dfs(String curr, int ind) {
        if (ind == arr.length) {
            if (!isSubsequence(curr, t)) {
                res++;
            }
            return;
        }

        // include
        dfs(curr + arr[ind], ind + 1);

        // exclude
        dfs(curr, ind + 1);
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == t.length();
    }
}
