import java .io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java .util.*;
public class Main{
    static int []dir={1,0,-1,0,1};
    public static class FastScanner {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public  FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreElements()) {
            try {
                String line = reader.readLine();
                if (line == null) return null;
                tokenizer = new StringTokenizer(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() { return Integer.parseInt(next()); }
    public long nextLong() { return Long.parseLong(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
}
public static class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
    public static void main(String[] args)
    {
        FastScanner sc=new FastScanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][]m=new char[r][c];
        for(int i=0;i<r;i++){
            m[i]=sc.next().toCharArray();
        }
        String dirs="DLUR";
        int[][]dirg=new int[r][c];
        for(int[]t:dirg)Arrays.fill(t,-1);
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]=='A'){
                    dirg[i][j]=8;
                    q.add(new Pair(i,j));

                    break;
                }
            }
            if(q.size()==1)break;
        }
        int br=-1,bc=-1;
        boolean found=false;
        while(!q.isEmpty()&&!found){
            Pair p=q.poll();
            for(int i=0;i<4;i++){
                int nr=p.a+dir[i];
                int nc=p.b+dir[i+1];
                if(nr<r&&nr>=0&&nc<c&&nc>=0&&m[nr][nc]!='#'&&dirg[nr][nc]==-1){
                    if(m[nr][nc]=='B'){
                        br=nr;
                        bc=nc;
                        found=true;
                        dirg[nr][nc]=i;
                        break;
                    }
                    q.add(new Pair(nr,nc));
                    dirg[nr][nc]=i;
                }

            }
            if(br!=-1&&bc!=-1)break;

        }
        
         int rv=br,cv=bc;
         String ans="";
         while(m[rv][cv]!='A'){
       
                     int dind=dirg[rv][cv];
                     ans=dirs.charAt(dind)+ans;
                     rv-=dir[dind];
                     cv-=dir[dind+1];
                 
                 
             }
             System.out.println("YES");
             System.out.println(ans.length());
             System.out.println(ans);
         


    }

}