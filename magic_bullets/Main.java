import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            long sum=0;
            int n=sc.nextInt();
            long h=sc.nextLong();
            int k=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            long rr=(h-1)/sum;
            long ans=rr*(n+k);
            h=h-(rr*sum);
            int lmin=Integer.MAX_VALUE;
            int[]rb=new int[n];
            rb[n-1]=0;
            for(int i=n-2;i>=0;i--){
                rb[i]=Math.max(rb[i+1],a[i+1]);
            }
            // System.out.println();
            // for(int i:rb)System.out.print(i+" ");
            // System.out.println();
            sum=0;
            for(int i=0;i<n;i++){
                sum+=a[i];
                lmin=Math.min(lmin,a[i]);
                if((sum>=h)||(sum-lmin+rb[i]>=h)){
                    ans+=i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
    }
/*5 10 1
4 2 3 7 3

5 10 1
4 2 3 5 3
*/