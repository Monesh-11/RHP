import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long a=y/x;
            for(long z=x+x;z<y;z+=x){
                long b=z/x;
                if(a%b!=0){
                    System.out.println("YES");
                   z=y;
                   y=1;
                }
            }
           if(y!=1) System.out.println("NO");
        }
    }
}