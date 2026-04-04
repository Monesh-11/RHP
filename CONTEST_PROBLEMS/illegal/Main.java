import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        if(l%5==0){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}