public class exs1 {
    public static void main(String[] args) {
        int[] fuel = {4, 9, 13, 25};
        int idx = 0;
        while (idx < fuel.length) {
            fuel[idx] *= 2;
            idx++;
        }
        System.out.print("boosted fuel stats: ");
        int k = 0;
        while (k < fuel.length) {
            System.out.print(fuel[k] + " ");
            k++;
        }
        System.out.println();
    }
}
