import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long q=sc.nextInt();
        long k=sc.nextInt();
        long[]a=new long[(int)n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        long[][]m=new long[(int)q][3];
        for(int i=0;i<q;i++){
            m[i][0]=sc.nextLong()-1;
            m[i][1]=sc.nextLong()-1;
            m[i][2]=sc.nextLong();
        }
        long[][]u=new long[(int)k][2];
        for(int i=0;i<k;i++){
            u[i][0]=sc.nextLong()-1;
            u[i][1]=sc.nextLong()-1;
        }
        long[]qa=new long[(int)q+1];
        for(int i=0;i<k;i++){
            qa[(int)u[i][0]]+=1;
            qa[(int)u[i][1]+1]-=1;
        }
        for(int i=1;i<=q;i++){
            qa[i]=qa[i-1]+qa[i];
         
        }
     
        long[]dp=new long[(int)n+1];
        for(int i=0;i<q;i++){
            m[i][2]*=qa[i];
    
        }
  
        for(int i=0;i<q;i++){
            dp[(int)m[i][0]]+=m[i][2];
            dp[(int)m[i][1]+1]-=m[i][2];
        }
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1]+dp[i];
        }
        
        for(int i=0;i<n;i++){
            a[i]+=dp[i];
        }
        for(long i:a){
            System.out.print(i+" ");
        }
    }
}