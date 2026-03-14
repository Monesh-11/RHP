import java.util.*;
public class Main{
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int q=sc.nextInt();
          while(q-->0){
               int n=sc.nextInt();
               int[]arr=new int[n];
               for(int i=0;i<n;i++)arr[i]=sc.nextInt();
               boolean flag=false;
               for(int i=1;i<n;i++){
                    if(arr[i]<arr[i-1]){
                         flag=true;
                         break;
                    }
               }
               System.out.println((flag)?1:n);
               
          }
     }
}