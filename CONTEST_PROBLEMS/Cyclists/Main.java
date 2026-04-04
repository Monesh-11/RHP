import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();

        while(q-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            int m=sc.nextInt();

            int[] a=new int[n+1];

            for(int i=1;i<=n;i++)
                a[i]=sc.nextInt();

            int ans=0;

            if(p<=k){
                ans=m/a[p];
            }
            else{
                int min=Integer.MAX_VALUE;

                for(int i=1;i<=k;i++)
                    min=Math.min(min,a[i]);

                int shifts=p-k;
                int cost=shifts*min;

                if(cost<=m)
                    ans=(m-cost)/a[p];
                else
                    ans=0;
            }

            System.out.println(ans);
        }
    }
}