import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=7;
        int q=sc.nextInt();
        while(q-->0){
            int[]a=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum-=a[i];
            }
            Arrays.sort(a);
            sum+=a[6];
            sum+=a[6];
            System.out.println(sum);
        }
    }
}