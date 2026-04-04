import java.util.*;
public class Main{
    public static void main(String[] args){
        int MOD=1_000_000_07;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer>a=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>b=new PriorityQueue<>();
        for(int i=0;i<n;i++)a.offer(sc.nextInt());
        for(int i=0;i<n;i++)b.offer(sc.nextInt());
        long ans=0;
        while(n-->0){
            
            int ones=a.poll();
            while(ones-->0)
            ans=(ans*2+1)%MOD;

            int zeros=b.poll();
            while(zeros-->0)
            ans=(ans*2)%MOD;
        }
        System.out.println(ans);
    }
}