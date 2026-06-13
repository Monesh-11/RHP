import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {

                int cnt = 0;

                if (i > 0) cnt++;       
                if (i < H - 1) cnt++;   
                if (j > 0) cnt++;       
                if (j < W - 1) cnt++;   

                System.out.print(cnt);

                if (j != W - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}