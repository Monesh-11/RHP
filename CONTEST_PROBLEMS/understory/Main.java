import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long q = sc.nextLong();
        TreeMap<Long, Long> map = new TreeMap<>();

        long size = 0;

        while (q-- > 0) {
            int type = sc.nextInt();
            long v = sc.nextLong();

            if (type == 1) {
                map.put(v, map.getOrDefault(v, 0L) + 1);
                size++;
            } else {

                NavigableMap<Long, Long> toRemove = map.headMap(v, true);

                long removedCount = 0;

                for (long freq : toRemove.values()) {
                    removedCount += freq;
                }

                size -= removedCount;

                toRemove.clear();
            }


             System.out.println(size);
        }

        sc.close();
    }
}