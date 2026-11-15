public class exs1 {
    public static int join(int a, int b) {
        return a + b;
    }

    public static int join(int a, int b, int c) {
        return a + b + c;
    }

    public static double join(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("int pair: " + join(12, 18));
        System.out.println("int trio: " + join(4, 5, 6));
        System.out.println("float pair: " + join(2.5, 9.3));
    }
}
