import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt()+1;
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=1;i<n;i++)a[i]=sc.nextInt();
        for(int i=1;i<n;i++)b[i]=sc.nextInt();

        for(int i=1;i<n;i++)
        {
            if(b[a[i]]!=i){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}