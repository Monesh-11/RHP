import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][]dp=new int[3][7];
        for(int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                int a=sc.nextInt();
                dp[i][a]++;
            }
        }
        int ans =
    dp[0][4] * dp[1][5] * dp[2][6] +
    dp[0][4] * dp[1][6] * dp[2][5] +
    dp[0][5] * dp[1][4] * dp[2][6] +
    dp[0][5] * dp[1][6] * dp[2][4] +
    dp[0][6] * dp[1][4] * dp[2][5] +
    dp[0][6] * dp[1][5] * dp[2][4];
System.out.print(ans/(float)216);
    }
}