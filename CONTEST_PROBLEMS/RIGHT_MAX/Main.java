import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            int ans=1;
            int max=a[0];
            for(int i=1;i<n;i++){
                if(max<=a[i]){
                    max=a[i];
                    ans++;
                }
            }
            

            System.out.println(ans);
        }
    }
}


