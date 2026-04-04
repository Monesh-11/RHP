import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            for(int i=1;i<=n*3;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}