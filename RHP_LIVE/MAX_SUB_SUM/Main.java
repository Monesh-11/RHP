import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
class Main{


// Class uses BufferedReader and StringTokenizer for efficient input
public static class FastScanner {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public FastScanner(InputStream in) {
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

    public static void main(String[] args) {
    FastScanner sc=new FastScanner(System.in);
    int n=sc.nextInt();
    long[]a=new long[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextLong();
    }       
    long sum=(a[0]>0)?a[0]:0;
    long max=a[0];
    for(int i=1;i<n;i++){
        sum+=a[i];
        max=Math.max(max,sum);
        if(sum<0){
            sum=0;
        }
        
    }
    System.out.println(max);
    }}
