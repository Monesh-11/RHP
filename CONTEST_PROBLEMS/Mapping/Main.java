import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        int m=sc.nextInt();
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        TreeSet<Integer>set=new TreeSet<>();
        for(int i:a)set.add(i);
        if(set.size()==n&&set.size()==m){
        System.out.println("Yes");
        System.out.println("Yes");
        return;
        }
        if(set.size()==n){
            System.out.println("Yes");
        }
        else System.out.println("No");
        if(set.size()==m){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
}