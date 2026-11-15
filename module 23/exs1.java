import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stats = new ArrayList<Integer>();
        System.out.println("type 10 stats:");
        for (int i = 0; i < 10; i++) {
            stats.add(sc.nextInt());
        }
        int total = 0;
        for (int v : stats) {
            total += v;
        }
        double mean = (double) total / stats.size();
        Collections.sort(stats);
        double median = (stats.get(4) + stats.get(5)) / 2.0;

        int mode = stats.get(0);
        int topReps = 0;
        for (int i = 0; i < stats.size(); i++) {
            int c = 0;
            for (int j = 0; j < stats.size(); j++) {
                if (stats.get(i).equals(stats.get(j))) c++;
            }
            if (c > topReps) {
                topReps = c;
                mode = stats.get(i);
            }
        }
        System.out.println("sum: " + total);
        System.out.println("mean: " + mean);
        System.out.println("median: " + median);
        System.out.println("mode: " + mode);
        sc.close();
    }
}
