import java.util.*;
public class aToz{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int flag=0;
for(char c:s.toCharArray()){
    flag=flag|(1<<c-'a');
}
//System.out.println(flag);
if(flag==(1<<26)-1){
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
}
}