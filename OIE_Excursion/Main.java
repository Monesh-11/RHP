import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            int dp[]=new int[n];
            Arrays.fill(dp,1);
            int max=1;
            for(int i=1;i<n;i++){
                if(a[i]==a[i-1]){
                    dp[i]=dp[i-1]+1;
                }
                max=Math.max(max,dp[i]);
            }
            System.out.println((max<m)?"YES":"NO");
        }
    }
}