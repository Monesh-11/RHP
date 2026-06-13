import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long p=sc.nextLong();
            long q=sc.nextLong();
            long s=p+q+q;
            for(int n=1;;n++){
                long num=s-n;
                long den=2*n+1;
                if(num<den*n)break;
                if(num%den==0){
                    long m=num/den;
                    long lmax=Math.min(m*(n+1),n*(m+1));
                    if(q<=lmax){
                        System.out.println(n+" "+m);
                        p=0;
                        q=0;
                        break;
                    }
                }

            }
            if(p!=0&&q!=0)System.out.println(-1);
        }
    }
}