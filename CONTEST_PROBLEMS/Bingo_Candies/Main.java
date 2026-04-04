import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            boolean f=true;
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n*n;i++){
                int v=sc.nextInt();
                map.put(v,map.getOrDefault(v,0)+1);
            }
            int l= n*(n-1);
            for(int i:map.keySet()){
                if(map.get(i)>l){
                    System.out.println("NO");
                    f=false;
                    break;
                }
            }
            if(f)
            {
                System.out.println("YES");
            }
        }
    }
}