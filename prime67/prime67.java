import java.util.*;
public class prime67{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    while(q-->0){
        int n=sc.nextInt();
        boolean f=false;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==67)f=true;
        }
        if(f)System.out.println("YES");
        else System.out.println("NO");
    }
    sc.close();
}
}