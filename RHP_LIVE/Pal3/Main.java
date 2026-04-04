import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
     //   System.out.println(s);
        int sum=0;
        int[] la=new int[26];
        int[] ra=new int[26];
        for(char c:s.toCharArray()){
            ra[c-'a']+=1;
        }
        for(char c:s.toCharArray()){
            ra[c-'a']-=1;
            for(int i=0;i<26;i++){
             //  System.out.println(la[v-'a']+" "+ra[v-'a']);
                sum+=(la[i]*ra[i]);
            }
            
            la[c-'a']+=1;
        //    System.out.println(sum);
        }
        System.out.println(sum);

    }
}