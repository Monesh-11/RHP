import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int[][]m=new int[r][];
        for(int i=0;i<r;i++){
            int c=sc.nextInt();
            m[i] = new int[c];
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(m[a-1][b-1]);
    }
}