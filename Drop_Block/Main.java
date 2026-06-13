import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[]a=new int[n+1];
        int bc[]=new int[600005];
        int d=0;
        while(q-->0){
            int t=sc.nextInt();
            int v=sc.nextInt();
            if(t==1){
                a[v]++;
                bc[a[v]]++;
                if(bc[a[v]]==n)d++;
            }
            else{
                System.out.println(bc[v+d]);
            }
        }
    }
}