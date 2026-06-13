import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); 
        int n = sc.nextInt(); 

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= e; i++) {
            adj.add(new ArrayList<>());
        }

        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj.get(a).add(b);
        }

        boolean[] vis = new boolean[e + 1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        vis[1] = true;

        while (!q.isEmpty()) {
            int t = q.poll();

            for (int neighbor : adj.get(t)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        int res = 0;
        for (int i = 1; i <= e; i++) {
            if (vis[i]) res++;
        }

        System.out.println(res);
    }
}
