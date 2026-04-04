import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        HashMap<Character,Integer>map_s=new HashMap<>();
        for(char c:s.toCharArray()){
            map_s.put(c,map_s.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!map_s.containsKey(c)){
                System.out.println("No");
                return;
            }
            map_s.put(c,map_s.get(c)-1);
            if(map_s.get(c)==0){
                map_s.remove(c);
            }
        }
       System.out.println("Yes");
    }
}