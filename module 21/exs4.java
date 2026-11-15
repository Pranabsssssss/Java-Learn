public class exs4 {
    public static void cleanSigns(int[] raw) {
        for (int num : raw) {
            System.out.println("abs of " + num + " is " + Math.abs(num));
        }
    }

    public static void main(String[] args) {
        int[] delta = {-45, 12, -8, 0, -999};
        cleanSigns(delta);
    }
}
