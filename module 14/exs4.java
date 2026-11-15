public class exs4 {
    public static long getProduct(int span) {
        long res = 1;
        for (int i = 1; i <= span; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("6 bang = " + getProduct(6));
        System.out.println("8 bang = " + getProduct(8));
    }
}
