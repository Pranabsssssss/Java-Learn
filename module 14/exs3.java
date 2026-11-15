public class exs3 {
    public static boolean checkPrime(int num) {
        if (num < 2) return false;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] pool = {3, 11, 15, 23, 49, 97};
        for (int p : pool) {
            System.out.println("testing " + p + ": " + checkPrime(p));
        }
    }
}
