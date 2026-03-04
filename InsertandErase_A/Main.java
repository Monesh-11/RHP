import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    String T=sc.nextLine();
   
   
    int ac=0,tc=0,oc=0,dc=0;
    while(oc<S.length()&&tc<T.length()){
     // if(T.charAt(tc)=='A'&&S.charAt(oc)=='A'){
       
 //     continue;
   //   }
      if(T.charAt(tc)!='A'&&S.charAt(oc)=='A'){
        dc++;
        oc++;
        continue;
      }
      if(T.charAt(tc)=='A'&&S.charAt(oc)!='A'){
        tc++;
        ac++;
        continue;
      }
      if(T.charAt(tc)!=S.charAt(oc)){
          System.out.println(-1);
          return;
      }
      
        tc++;
        oc++;
      
 
      
    }   
    if(tc==T.length()){
      System.out.println(ac+dc);
      return;
    }
    System.out.println(ac+dc+T.length()-tc);
    sc.close();
  }
  
}