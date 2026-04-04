import java.util.*;
public class Maxheap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.offer(-sc.nextInt());
        }
        while(!pq.isEmpty()){
            System.out.print(-pq.poll()+" ");
        }
    }
    }
