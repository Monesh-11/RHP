import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int[] yofx = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            yofx[x] = y;
        }
        int miny=Integer.MAX_VALUE;
        for (int x = 1; x <= n; x++) {
            int c = yofx[x];
            
            if (c < miny) {
                ans++;
                miny = c;
            }
        }
        System.out.println(ans);
    }
}