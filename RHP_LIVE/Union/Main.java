import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]con=new int[n][2];
        for(int i=0;i<n;i++){
            con[i][0]=sc.nextInt();
            con[i][1]=sc.nextInt();
        }
        int[]parent=new int[n];
        for(int i=0;i<n;i++)parent[i]=i;

        for(int i=0;i<n;i++){
            merge(parent,con[i][0],con[i][1]);
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:parent)
        {
        map.put(i,map.getOrDefault(i, 0)+1);
        System.out.print(i+" ");
        }
        System.out.println();

        int max=-1;
        for(int i:map.keySet())max=Math.max(max,map.get(i));

        System.out.println(max);

    }
    public static void merge(int[] parent,int a,int b){
        parent[b]=find(parent,a);
    }
    public static int find(int[]parent,int v){
        if(parent[v]==v)return v;
        return find(parent,parent[v]);
        
    }
}