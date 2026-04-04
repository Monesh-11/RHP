import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int xor=0;
        for(int i:a)xor^=i;
     //   System.out.println(xor);
        int d=0;
        while((xor&(1<<d))==0)d++;
        int og=0,zg=0;

        for(int i:a){
            if((i&(1<<d))==1) og^=i;
            else zg^=i;
        }
        System.out.println(og+" "+zg);

    }
}