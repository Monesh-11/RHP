import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Integer,Integer>fom=new HashMap<>();
        int ctr=0;
        int maxlen=0;
        fom.put(0,-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a')ctr++;
            else ctr--;
            if(!fom.containsKey(ctr)){
                fom.put(ctr,i);
            }
            else{
                maxlen=Math.max(maxlen,i-fom.get(ctr));
            }
        }
System.out.println(maxlen);
    }
}