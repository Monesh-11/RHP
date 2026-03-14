import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            String s=sc.next();
            ArrayList<Integer>z=new ArrayList<>();
             ArrayList<Integer>o=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0')z.add(i+1);
                else o.add(i+1);
            }
            if(z.size()==n){
                System.out.println(0);
                continue;
            }
            if(o.size()%2!=0&&z.size()%2==0){
                System.out.println(-1);
                continue;
            }
            if(o.size()==n&&n%2!=0){
                System.out.println(-1);
                continue;
            }
            if(z.size()%2!=0){
                System.out.println(z.size());
                for(int i:z)System.out.print(i+" ");
                System.out.println();
                continue;
            }
            if(o.size()%2==0)
            {
                System.out.println(o.size());
                for(int v:o)System.out.print(v+" ");
                System.out.println();
            }

        }
    }
}