import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    char[][]m=new char[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            m[i][j]=sc.next().charAt(0);
        }
    }
    
}
}