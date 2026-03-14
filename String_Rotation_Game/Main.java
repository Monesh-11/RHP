import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int b=0,max=1,seqlen=1;
            int n=sc.nextInt();
            String s=sc.next();
            for(int i=1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    seqlen++;
                }
                else{
                    max=Math.max(max,seqlen);
                    seqlen=1;
                    b++;
                }
            }
            max=Math.max(max,seqlen);
            b++;
            if(s.charAt(0)!=s.charAt(n-1)&&max>1){
                b++;
            }
            System.out.println(b);



        }
    }
}