import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    int q=sc.nextInt();
    while(q-->0){
    int n=sc.nextInt();
    int t=sc.nextInt();
    int max=n;
    int min=n;
    int cnt=0;
    boolean f=true;
    while(max>=t||min>=t)
    {

        
        if(max==t||min==t){
            System.out.println(cnt);
            f=false;
            break;
        }
        max=(max+1)/2;
        min=min/2;
        cnt++;
    }
    if(f)System.out.println(-1);
    }
    
}
}