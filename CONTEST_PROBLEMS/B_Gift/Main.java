import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>>m=new HashMap<>();
        int p=1;
        for(int i=0;i<n;i++){
            
            int q=sc.nextInt();
            while(q-->0){
                int v=sc.nextInt();
                if(m.containsKey(v)){
                    m.get(v).add(p);
                }
                else{
                    m.putIfAbsent(v,new ArrayList<Integer>());
                    m.get(v).add(p);
                }
            }
            p++;
        }
    for(int k=1;k<=n;k++){
        if(m.containsKey(k)){
        ArrayList<Integer>t=m.get(k);
        System.out.print(t.size()+" ");
        for(int i:t)System.out.print(i+" ");
        System.out.println();
        }
        else System.out.println(0);
    }
    }
}