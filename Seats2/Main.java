import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N,M;
    M=sc.nextInt();
    N=sc.nextInt();
    if(N*2-1<=M){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
    sc.close();
  }
}