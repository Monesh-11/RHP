import java.util.*;
public class Main{
    public static TreeSet<Integer>t=new TreeSet<>();
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    TreeSet<Integer>set=new TreeSet<>();
    for(int i=0;i<30;i++){
        set.add((int)Math.pow(2,i));
    }
    dfs(set,"");
    set.addAll(t);
    ArrayList<Integer>res=new ArrayList<>(set);
    System.out.println(res.get(n-1));

}
public static void dfs(TreeSet<Integer>set,String s){
      if(s.length()>9)return;
    if(s.length()!=0&&s.length()<=9){
        t.add(Integer.parseInt(s.toString()));
    }
  

    for(int i:set){
        dfs(set,s+Integer.toString(i));
      //  dfs(set,s);
    }
}
}
