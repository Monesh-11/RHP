import java.util.*;
public class Main{
    static int mod=(int)1e+7;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        long ans=0;
        int res=0;
        for(int i=n-1;i>=0;i--){
            ans=(ans*10+s.charAt(i)-'0')%mod;
            if(ans==0)res++;
        }
System.out.println(res);
    }

}