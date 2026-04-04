import java .io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java .util.*;
public class Main{
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

    public static void main(String[] args)
    {
        FastScanner sc=new FastScanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][]m=new char[r][c];
        for(int i=0;i<r;i++){
            m[i]=sc.next().toCharArray();
        }
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]=='.'){
                    isRoom(m,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);


    }
    public static void isRoom(char[][]m,int x,int y){
        int r=m.length;
        int c=m[0].length;
        if(x<0||x>=r||y<0||y>=c||m[x][y]=='#')return;
        m[x][y]='#';
        isRoom(m,x-1,y);
        isRoom(m,x+1,y);
        isRoom(m,x,y-1);
        isRoom(m,x,y+1);

        
    }

}