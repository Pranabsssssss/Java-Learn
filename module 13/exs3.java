public class exs3 {
    public static void spotParity(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " hit even");
        } else {
            System.out.println(n + " hit odd");
        }
    }

    public static void main(String[] args) {
        spotParity(24);
        spotParity(31);
    }
}
