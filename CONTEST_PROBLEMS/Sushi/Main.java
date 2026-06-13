import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        PriorityQueue<Integer>pn=new PriorityQueue<>();
        PriorityQueue<Integer>ps=new PriorityQueue<>();
        for(int i=0;i<s;i++)ps.offer(sc.nextInt());
        for(int i=0;i<n;i++)pn.offer(sc.nextInt());
        int c=0;
        while(!pn.isEmpty()&&!ps.isEmpty()){
            int a=ps.poll();
            int b=pn.poll();
            if(b<=a+a)c++;
            if(a+a<b){
                pn.offer(b);
            }
        }
        System.out.println(c);
    }
}