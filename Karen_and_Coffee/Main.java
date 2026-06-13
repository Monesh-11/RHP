import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int q=sc.nextInt();
        int s=200002;
        long[]dp=new long[s];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a]+=1;
            dp[b+1]-=1;
        }
         for(int i=1;i<s;i++){
            dp[i]+=dp[i-1];
        }
        int c=0;
        for(int i=0;i<s;i++){
            if(dp[i]>=t)c++;
            dp[i]=c;
        }
        // long[]cum=new long[s];
        // cum[0]=dp[0];
        // for(int i=1;i<s;i++){
        //     dp[i]+=dp[i-1];
        // }
        // for(int i=90;i<=100;i++)System.out.print(dp[i]+" ");
        // System.out.println();
        for(int i=0;i<q;i++){
             int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(dp[b]-dp[a-1]);
        }
    }
}