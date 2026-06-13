import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>m=new HashMap<>();
        m.put("abc",2);
        m.put("def",3);
        m.put("ghi",4);
        m.put("jkl",5);
        m.put("mno",6);
        m.put("pqrs",7);
        m.put("tuv",8);
        m.put("wxyz",9);
        int n=sc.nextInt();
        String r="";
        while(n-->0){
            String s=sc.next();
            String f=s.substring(0,1);
            for(String k:m.keySet()){
                if(k.contains(f))
                {
                r+=m.get(k);
                break;
                }
            }
        }
        System.out.println(r);
    }
}