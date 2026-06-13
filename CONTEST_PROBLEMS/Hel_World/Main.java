import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="HelloWorld";
        int t=sc.nextInt()-1;
        for(int i=0;i<s.length();i++){
            if(t==i)continue;
            System.out.print(s.charAt(i));
        }
    }
}