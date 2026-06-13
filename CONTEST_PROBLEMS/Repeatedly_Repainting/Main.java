
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] m = new char[r][c];
        for (int i = 0; i < r; i++) {
            m[i] = sc.next().toCharArray();
        }

        // '#' -> black 
        // '.' -> white
        char[][] t = new char[r][c];
        int[] dir = {-1, 0, 1, 0, -1};

        for (int step = 0; step < 2; step++) {

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int blackNeighbors = 0;
                    int totalNeighbors = 0;

                    for (int d = 0; d < 4; d++) {
                        int ni = i + dir[d];
                        int nj = j + dir[d + 1];

                        if (ni >= 0 && ni < r && nj >= 0 && nj < c) {
                            totalNeighbors++;
                            if (m[ni][nj] == '#') {
                                blackNeighbors++;
                            }
                        }
                    }

                    int whiteNeighbors = totalNeighbors - blackNeighbors;

                    if (blackNeighbors > whiteNeighbors) {
                        t[i][j] = '#';
                    } else if (whiteNeighbors > blackNeighbors) {
                        t[i][j] = '.';
                    } else {
                        t[i][j] = m[i][j];
                    }
                }
            }

            char[][] temp = m;
            m = t;
            t = temp;
        }

        for (int i = 0; i < r; i++) {
            System.out.println(new String(m[i]));
        }

       
    }
}
