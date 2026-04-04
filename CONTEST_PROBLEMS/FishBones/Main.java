import java.util.*;
public class Main{
    public static HashMap<Integer,ArrayList<String>>map=new HashMap<>();
    int n
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]m=new int[n][2];
        for(int i=0;i<n;i++){
            m[i][0]=sc.nextInt();
            m[i][1]=sc.nextInt();
        }
        int l=sc.nextInt();
        
        String[]arr=new String[l];
        for(int i=0;i<l;i++)arr[i]=sc.next();
        while(l-->0){
            String s=arr[l];
            int k=s.length();
            if(map.containsKey(k)){
                map.get(k).add(s);
            }
            else{
                map.put(k,new ArrayList<>());
                map.get(k).add(s);
            }
        }
        System.out.println(map);
        for(String s:arr){
            if(s.length()==n&&check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String s){
        
    }
}