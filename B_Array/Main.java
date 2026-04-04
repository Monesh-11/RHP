import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int l=0,s=0;
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j])l++;
                if(a[i]>a[j])s++;
            }
            System.out.print(Math.max(l,s)+" ");
        }
        System.out.println();
        }
    }
}