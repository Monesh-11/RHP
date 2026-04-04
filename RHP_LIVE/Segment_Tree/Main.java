
import java.util.*;

public class Main {

    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int s = n;
        while((s & (s - 1)) != 0) s++;
        int[] arr = new int[s*2];
        //    System.out.println(s);
        for (int i = s; i < s + n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = s - 1; i >= 1; i--) {
            arr[i] = arr[i * 2] + arr[i * 2 + 1];
        }

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        while (q-- > 0) {
            int type = sc.nextInt();
            int st = sc.nextInt();
            int en = sc.nextInt();
            //    System.out.println(find(arr,1,1,s,st,en));
            if (type == 1) {
                update(st, en, arr, s); 
            }else {
                int ans = sum(st, en, arr, s);
                System.out.println(ans);
            }
        //       for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
         }
       

    }

    public static int pow(int n) {
        int co = 0;
        while (1 << co <= n) {
            co++;
        }
        return 1 << co;
    }

    public static int sum(int a, int b, int[] tree, int n) {
        a += n;
        b += n;
        int s = 0;
        while (a <= b) {
            if ((a & 1) == 1) {
                s += tree[a++];
            }
            if ((b & 1) == 0) {
                s += tree[b--];
            }
            a /= 2;
            b /= 2;
        }
        return s;
    }

    public static void update(int k, int x, int[] tree, int n) {
        k += n;
        tree[k] += x;
        for (k /= 2; k >= 1; k /= 2) {
            tree[k] = tree[2 * k] + tree[2 * k + 1];
        }
    }
}

