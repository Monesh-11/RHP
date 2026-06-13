import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int co=0;
            String s=sc.next();
            for(int i=1;i<s.length();i++){
                if(s.charAt(i-1)==s.charAt(i))co++;
            }
            if(co<3)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}