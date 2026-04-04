import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][]g=new char[r][c];
        for(char[]t:g)Arrays.fill(t,'#');
        for(int i=1;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                g[i][j]='.';
            }
        }
        for(char[]t:g){
            for(char v:t){
                System.out.print(v);
            }
            System.out.println();
        }
    }
}