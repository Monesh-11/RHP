import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int l=sc.nextInt();
        System.out.println(s.substring(l,n-l));
    }
}