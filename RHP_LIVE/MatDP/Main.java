import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int[][]m=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++)m[i][j]=sc.nextInt();
    }
    int[][]par=new int[r][c];
    int fm=0,sm=0;
    int ind1=-1,ind2=-1;
    for(int i=0;i<c;i++)
    {
    par[0][i]=m[0][i];
    if(par[0][i]>fm){
        sm=fm;
        fm=par[0][i];
        ind1=i;
    }
    if(par[0][i]>sm&&par[0][i]<fm){
        sm=par[0][i];
        ind2=i;
    }
    
    }
    System.out.println(ind1+" "+ind2);
    
    for(int i=1;i<r;i++){
        int x=ind1,y=ind2;
        System.out.println(fm+" "+sm);
        for(int j=0;j<c;j++){
            if(ind1==j)par[i][j]=m[i][j]+par[i-1][ind2];
            else par[i][j]=m[i][j]+par[i-1][ind1];

            if(par[i][j]>fm){
            sm=fm;
            fm=par[i][j];
            int t=x;
             x=j;
             y=t;
             }
            if(par[i][j]>sm&&par[i][j]<fm){
             sm=par[i][j];
             y=j;
    }
        }
        ind1=x;
        ind2=y;
    }
    for(int[]t:par){
        for(int i:t)System.out.print(i+" ");
        System.out.println();
    }

    System.out.println(par[r-1][ind1]);

}}
