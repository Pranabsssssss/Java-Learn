public class exs3 {
    public static void main(String[] args) {
        for (int n = 1; n <= 30; n++) {
            if (n % 4 == 0) {
                continue;
            }
            if (n == 23) {
                break;
            }
            System.out.print(n + " ");
        }
        System.out.println("loop killed early");
    }
}
