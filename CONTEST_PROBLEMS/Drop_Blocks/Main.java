
import java.util.*;

public class Main {
public static int act=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        while (q-- > 0) {
            int t = sc.nextInt();

            if (t == 1) {
                int ind = sc.nextInt() - 1;
                check(a,ind);
            }
            else{
                int m=sc.nextInt();
                dis(a,m);
            }
        }
    }
    public static void check(int[]a,int ind){
        if(a[ind]==0)act++;
        a[ind]++;
        if(act==a.length){
            act=0;
            for(int i=0;i<a.length;i++){
                a[i]--;
                if(a[i]>0)act++;
            }
        }
    }
    public static void dis(int[]a,int m){
        int co=0;
        for(int i:a){
            if(i>=m)co++;
        }
        System.out.println(co);
    }
}
