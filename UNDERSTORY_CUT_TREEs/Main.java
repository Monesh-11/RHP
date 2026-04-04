import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int q=sc.nextInt();
        while(q-->0){
            int type=sc.nextInt();
            if(type==1){
                pq.add(sc.nextInt());
            }
            else{
                int v=sc.nextInt();
                while(!pq.isEmpty()&&pq.peek()<=v)pq.poll();
            }
            System.out.println(pq.size());
        }
    }}
