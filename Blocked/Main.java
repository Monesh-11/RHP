import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            TreeSet<Integer>set=new TreeSet<>(Collections.reverseOrder());
            for(int i=0;i<n;i++)set.add(sc.nextInt());
            if(set.size()!=n){
                System.out.println(-1);
                continue;
            }
            for(int i:set)System.out.print(i+" ");
            System.out.println();
        }
    }
}