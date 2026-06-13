    // import java.util.*;
    // public class Main{
    //     public static void main(String[] args){
    //         Scanner sc=new Scanner(System.in);
    //         int t=sc.nextInt();
    //         while(t-->0){
    //             String a=sc.next();
    //             String b=sc.next();
    //             if(a.equals(b)){
    //                 System.out.println("Yes");
    //                 continue;
    //             }
    //             a=repCh(a);
    //             b=repCh(b);
    //             if(a.equals(b))System.out.println("Yes");
    //             else System.out.println("No");
                
    //         }
    //     }
    //     public static String repCh(String s){
    //         StringBuilder sb=new StringBuilder(s);
    //         while(sb.contains("(xx)")){
    //             sb=sb.replaceAll("(xx)","xx");
    //         }
    //         return s;
    //     }
    // }
    import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            if(check(a, b)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean check(String a, String b){
        while(true){
            if(a.equals(b)) return true;

            boolean changed = false;

            if(a.contains("(xx)")){
                a = a.replace("(xx)", "xx");
                changed = true;
            }

            if(b.contains("(xx)")){
                b = b.replace("(xx)", "xx");
                changed = true;
            }

            if(!changed) break; 
        }

        return false;
    }
}
