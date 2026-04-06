import java.io.*;
import java.util.*;

public class Main {
    static int[] dir = {1, 0, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] m = new char[r][c];
        for (int i = 0; i < r; i++) {
            m[i] = br.readLine().toCharArray();
        }

        int[][] dirg = new int[r][c];
        for (int[] row : dirg) Arrays.fill(row, -1);

        Queue<int[]> q = new ArrayDeque<>();

        // find A
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] == 'A') {
                    q.add(new int[]{i, j});
                    dirg[i][j] = 8;
                }
            }
        }

        int brx = -1, bcx = -1;
        boolean found = false;

        String dirs = "DLUR";

        while (!q.isEmpty()) {
            int[] p = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = p[0] + dir[i];
                int nc = p[1] + dir[i + 1];

                if (nr >= 0 && nr < r && nc >= 0 && nc < c &&
                        m[nr][nc] != '#' && dirg[nr][nc] == -1) {

                    dirg[nr][nc] = i;

                    if (m[nr][nc] == 'B') {
                        brx = nr;
                        bcx = nc;
                        found = true;
                        break;
                    }

                    q.add(new int[]{nr, nc});
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("NO");
            return;
        }

        // reconstruct path
        StringBuilder sb = new StringBuilder();
        int rv = brx, cv = bcx;

        while (m[rv][cv] != 'A') {
            int d = dirg[rv][cv];
            sb.append(dirs.charAt(d));
            rv -= dir[d];
            cv -= dir[d + 1];
        }

        sb.reverse();

        System.out.println("YES");
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}