import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int v=sc.nextInt();
            System.out.println(Math.max(v,67));
        }
    }
}