import java.util.*;

public class heapify1 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int q=sc.nextInt();
while(q-->0){
int n=sc.nextInt();
int[]a=new int[n+1];
for(int i=1;i<=n;i++)a[i]=sc.nextInt();
boolean f=true;
for(int st=1;st<=n;st+=2){

ArrayList<Integer>temp=new ArrayList<>();
for(int i=st;i<=n;i*=2){
temp.add(a[i]);
}
Collections.sort(temp);
//System.out.println(temp);
for(int ind=0,i=st;i<=n;i*=2,ind++){
if(i!=temp.get(ind)){
f=false;
break;
}
  }
 if(!f)break;
}
if(f)System.out.println("YES");
 else System.out.println("NO");
}
sc.close();
}
}
