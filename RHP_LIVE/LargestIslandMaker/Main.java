import java.util.*;
public class Main {
    int dr[]={1,0,0,-1};
    int dc[]={0,1,-1,0};
    HashMap<Character,Integer>map;
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        int count=0;
        boolean[][]vis=new boolean[n][n];
        char[][]par=new char[n][n];
         for(char[]p:par)Arrays.fill(p,'0');
        char c='a';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1&&!vis[i][j]){
                    dfs(grid,vis,i,j,c,par);
                    count++;
                    c++;
                }
            }
        }
        int size=c-'a';
        map=new HashMap<>();
        for(char[]p:par){
            for(char i:p)map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int res=1;
        boolean f=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(par[i][j]=='0'){
                    f=false;
                    res=Math.max(check(i,j,par),res);
                }
            }
        }
        if(f)res=n*n;
        return res;

    }

    public int check(int x,int y,char[][]p){
        int n=p.length;
        int diff=0;
        HashSet<Character>set=new HashSet<>();
            for(int i=0;i<4;i++){
                int a=x+dr[i];
                int b=y+dc[i];
                if(a<0||a>=n||b<0||b>=n||p[a][b]=='0')continue;
                set.add(p[a][b]);

            }
       //     System.out.println(set);
            int d=set.size();
            int sum=0;
            for(char c:set){
                sum+=map.get(c);
            }
            sum+=1;
            return sum;
    }
    public void dfs(int[][]g,boolean[][]v,int x,int y,char c,char[][]p){
        int n=g.length;
        if(x<0||x>=n||y<0||y>=n||v[x][y]||g[x][y]==0){
            return;
        }
        v[x][y]=true;
        p[x][y]=c;
        dfs(g,v,x+1,y,c,p);
        dfs(g,v,x,y+1,c,p);
        dfs(g,v,x,y-1,c,p);
        dfs(g,v,x-1,y,c,p);

    }

    public  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]m=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println(largestIsland(m));
    }
    }
