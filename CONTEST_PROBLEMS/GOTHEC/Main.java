import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int d=sc.nextInt();
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(1,7);
    map.put(3,3);
    map.put(5,5);
    map.put(7,7);
    map.put(9,9);
    if(map.keySet().contains(m)){
        if(map.get(m)==d){
            System.out.println("Yes");
            return;
        }
    }
    System.out.println("No");
}
}