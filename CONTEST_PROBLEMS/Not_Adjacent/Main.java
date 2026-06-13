
import java.util.*;

public class Main {
    static final long MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long res=0;
        long len =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                len++;
            }
            else{
                res=(res+(len*(len+1)/2)%MOD)%MOD;
                len=1;
            }
        }
        res=(res+(len*(len+1)/2)%MOD)%MOD;
        System.out.println(res);
    }
}
