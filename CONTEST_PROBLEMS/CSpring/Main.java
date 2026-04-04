import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int w=sc.nextInt();
            int at=(w/a)*6;
            int bt=(w/b)*6;
            int ct=(w/c)*6;
            int coall=lcm(a,lcm(b,c))*4;
            int ab=lcm(a,b)*3;
            int ac=lcm(a,c)*3;
            int bc=lcm(b,c)*3;
            at-=coall;
            at-=(ab-coall);
            at-=(ac-coall);
            
            bt-=coall;
            bt-=(ab-coall);
            bt-=(bc-coall);


            ct-=coall;
            ct-=(bc-coall);
            ct-=(ac-coall);
        System.out.println(at+" "+bt+" "+ct);
        }
    }
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }


}