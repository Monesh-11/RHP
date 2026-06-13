import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
            int n=sc.nextInt();
            long[]a=new long[n];
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            int max=0;
            for(int ctr=1;ctr<(1<<n);ctr++){
                long cur=0,nxt=0;
                int cross=0;
                for(int sh=0;sh<n;sh++){
                  //  System.out.println((ctr&(1<<sh)));
                    if((ctr&(1<<sh))==0)nxt-=a[sh];
                    else nxt+=a[sh];
                
                if((cur<=0&&nxt>=0)||(cur>=0&&nxt<=0))cross++;
                cur=nxt;
                }
                max=Math.max(max,cross);
            }
            System.out.println(max);
        

    }
}