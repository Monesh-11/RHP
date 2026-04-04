import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] vis = new boolean[n];
            int pos = 0; 
            vis[pos] = true;

            for(int i=0;i<n;i++){
                if(s.charAt(pos)=='R')
                    pos++;
                else
                    pos--;

                vis[pos] = true;
            }

            int count = 0;
            for(boolean v:vis)
                if(v) count++;

            System.out.println(count);
        }
    }
}