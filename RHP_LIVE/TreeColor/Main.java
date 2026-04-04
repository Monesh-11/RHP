import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n+1;i++)adj.add(new ArrayList<>());
        for(int i=1;i<=n;i++){
            adj.get(sc.nextInt()).add(i);
        }
  //      System.out.println(adj);
        int[]col=new int[n+1];
        for(int i=1;i<=n;i++)col[i]=sc.nextInt();
        int q=sc.nextInt();
        int sum=0;
        while(q-->0){
            int root=sc.nextInt();
            HashSet<Integer>vis=new HashSet<>();
            sum+=find(root,adj,col,vis);
        }
System.out.println(sum);
    }
    public static int find(int root,ArrayList<ArrayList<Integer>>adj,int ca[],HashSet<Integer>vis){
        int maxnodes=0;
        boolean inclval=false;

        if(!vis.contains(ca[root])){
            inclval=true;
            vis.add(ca[root]);
        }
        for(int child:adj.get(root)){
            maxnodes=Math.max(maxnodes,find(child,adj,ca,vis));
        }
        if(inclval)maxnodes++;
        return maxnodes;
    }
}