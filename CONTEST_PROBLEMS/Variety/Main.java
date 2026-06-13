import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int d=sc.nextInt();
        long[][]m=new long[n][2];
        for(int i=0;i<n;i++){
            m[i][0]=sc.nextLong();
            m[i][1]=sc.nextLong();
        }
        Arrays.sort(m, (r1, r2) -> Long.compare(r2[1], r1[1]));
       
        long res=0;
        int ind=0;
        HashSet<Long>vis=new HashSet<>();
        while(k>0)
        {
            if(!vis.contains(m[ind][0])){
                 res+=m[ind][1];
                k--;
                d--;
                vis.add(m[ind][0]);
                
            }
            else if(k>d){
               res+=m[ind][1];
                k--;
            }
            ind++;
        
       }
        System.out.println(res);
}
}