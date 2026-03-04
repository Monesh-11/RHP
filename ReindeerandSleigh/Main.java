import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    
    while(q-->0){
      long currw=0;
      int n=sc.nextInt();
      long m[][]=new long[n][3];
      for(int i=0;i<n;i++){
        m[i][1]=sc.nextLong();
        m[i][2]=sc.nextLong();
        m[i][0]=m[i][1]+m[i][2];
        currw+=m[i][1];
      }
      Arrays.sort(m,(a,b)->Long.compare(b[0],a[0]));
      
      long pullp=0;
      int res=n;
      for(int i=0;i<n&&pullp<currw;i++){
        pullp+=m[i][2];
        currw-=m[i][1];
        res-=1;
      }
      
      System.out.println(res);
    }
    
  }
}