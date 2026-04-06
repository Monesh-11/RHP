import java.io.*;
import java.util.*;

public class Main {
    static long[] bit;
    static int n;


    static void update(int i, long delta) {
        while (i <= n) {
            bit[i] += delta;
            i += i & -i;
        }
    }


    static long sum(int i) {
        long s = 0;
        while (i > 0) {
            s += bit[i];
            i -= i & -i;
        }
        return s;
    }

    static long rangeSum(int l, int r) {
        return sum(r) - sum(l - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        bit = new long[n + 1];
        long[] arr = new long[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            update(i, arr[i]); // build
        }

        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int k = Integer.parseInt(st.nextToken());
                long u = Long.parseLong(st.nextToken());

                long delta = u - arr[k];
                arr[k] = u;
                update(k, delta);
            } else {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                sb.append(rangeSum(a, b)).append("\n");
            }
        }

        System.out.print(sb);
    }
}
