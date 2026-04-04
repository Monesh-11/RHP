import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int mlen=0;
        int ctr=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(a[i]==1)ctr++;
            else ctr--;
            if(!map.containsKey(ctr)){
                map.put(ctr,i);
            }
            else {
                mlen=Math.max(mlen,i-map.get(ctr));
            }
        }
        System.out.println(map);
        System.out.println(mlen);
    }
}