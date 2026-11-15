public class exs3 {
    public static void dumpPowers(int[] list) {
        for (int n : list) {
            System.out.println(n + " sq -> " + (n * n) + " | cube -> " + (n * n * n));
        }
    }

    public static void main(String[] args) {
        int[] vals = {3, 6, 8, 10};
        dumpPowers(vals);
    }
}
