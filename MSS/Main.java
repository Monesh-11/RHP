import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String S=sc.nextLine();
    int maxfreq=1;
    HashMap<Character,Integer>freq=new HashMap<>();
    for(char c:S.toCharArray())
    {
    freq.put(c,freq.getOrDefault(c,0)+1);
    maxfreq=(freq.get(c)>maxfreq)?freq.get(c):maxfreq;
    }
    for(char c:S.toCharArray()){
      if(freq.get(c)==maxfreq)continue;
      System.out.print(c);
    }
    sc.close();
    
  }
}