import java.util.*;
class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int flag=0;
        for(char c:s.toCharArray()){
            flag=flag^(1<<c-'a');
        }
        if(flag==0||(flag&(flag-1))==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}