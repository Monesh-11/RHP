import java.util.*;

public class Main {
    static final long MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long a=0,b=0,c=0;
        long na=a,nb=b,nc=c;
        for(char ch:s.toCharArray())
        {
            na=a;
            nb=b;
            nc=c;
            if(ch=='a'){
                na=(a+1+b+c)%MOD;
            }
            else if(ch=='b'){
                nb=(b+1+a+c)%MOD;
            }
            else{
                nc=(c+1+a+b)%MOD;
            }
            a=na;
            b=nb;
            c=nc;
        }
        
        long res=(a+b+c)%MOD;
        System.out.println(res);


    }
}