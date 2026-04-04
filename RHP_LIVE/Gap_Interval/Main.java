import java.util.*;
public class Main{
    public static int mod=1000000007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int q=sc.nextInt();
        int[][]m=new int[q][4];
        int in=0;
        while(in<q){
            m[in][0]=sc.nextInt();
            m[in][1]=sc.nextInt();
            m[in][2]=sc.nextInt();
            m[in][3]=sc.nextInt();
            in++;
        }
        
        int li=m[q-1][0],ri=m[q-1][1];
        modify(a,li,ri,m[q-1][2],m[q-1][3],0);
        q-=1;
        // for(int i:a)System.out.print(i+" ");
        // System.out.println();
        while(q-->0){
            if(li==0&&ri==n-1) break;
            int l=m[q][0];
            int r=m[q][1];
            int x=m[q][2];
            int y=m[q][3];
            if(li>l){
                modify(a,l,li-1,x,y,r-(li-l));
                li=l;
            }
            if(ri<r){
                modify(a,ri+1,r,x,y,r-(r-ri));
            }
            for(int i:a)
            System.out.print(i+" ");
        System.out.println("..."+q);
        }

        int sum=0;
        for(int i:a)sum+=i;
        System.out.println(sum);
    }
    public static void modify(int[]a,int l,int r,int x,int y,int c){
        
        for(int i=l;i<=r;i++){
            a[i]=x+(c*y);
         //  System.out.println(i-l);
            c++;
        }
    }

}