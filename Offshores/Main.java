import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int con[]=new int[n];
            int[]a=new int[n];
            long ta=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                con[i]=(a[i]/x)*y;
                ta+=con[i];
            }
            long m=a[0]+ta-con[0];
            for(int i=0;i<n;i++){
                m=Math.max(m,a[i]+ta-con[i]);
            }
            System.out.println(m);
        }
    }
}