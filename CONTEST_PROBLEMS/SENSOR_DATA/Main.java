import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(0+" "+d);
        for(int i=1;i<=n;i++){
            int t=sc.nextInt();
            if(Math.abs(t-d)>=x){
                System.out.println(i+" "+t);
                d=t;
            }
        }
    }
}