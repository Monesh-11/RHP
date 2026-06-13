import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][]m=new char[r][c];
        for(int i=0;i<r;i++){
           m[i]=sc.next().toCharArray();
        }
        int si=-1,sj=-1,gi=-1,gj=-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]=='S'){
                    si=i;
                    sj=j;
                }
                if(m[i][j]=='G'){
                    gi=i;
                    gj=j;
                }
            }
        }
        
    }
}