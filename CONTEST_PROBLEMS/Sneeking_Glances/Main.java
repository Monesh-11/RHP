
import java.util.*;

public class Main {
    public static int n;
    public static int max=0;
    public static long[] a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        dfs(0,1,0);
        System.out.println(max);

    }
    public static void dfs(int idx,long s,int count){
        if(idx==n){
            max=Math.max(max,count);
            return;
        }
        long len=2*a[idx];

        long next=s-len;
        int add=(s > 0 && next <0)?1:0;

        dfs(idx + 1, next, count + add);
        next = s + len;
        add = (s < 0 && next > 0) ? 1 : 0;
        dfs(idx + 1, next, count + add);
    }
}
