import java.util.*;
public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][]m=new int[n][n];

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            m[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++)
        {
            System.out.print(m[i][j]+ " ");
        }
        System.out.println();
    }
    
    for (int k = 0; k < n; k++) {
    for (int i = 0; i < n-1; i++) {
        for (int j = i+1; j < n; j++) {

            if (m[i][k] + m[k][j] <m[i][j]&&m[i][k]!=0&&m[k][j]!=0) {
                System.out.println("Yes");
                return;
            }

            m[i][j] = Math.min(m[i][j], m[i][k] + m[k][j]);
        }
    }
}
System.out.println("No");

    }
}