import java.util.*;
class LIS{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Running");
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int[]res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=1;
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
        }
        int ans=1;
        for(int i:res)ans=Math.max(ans, i);
        
        System.out.println(ans);
    }
}