public class exs2 {
    public static int topDawg(int val1, int val2) {
        return (val1 >= val2) ? val1 : val2;
    }

    public static void main(String[] args) {
        System.out.println("winner: " + topDawg(89, 120));
        System.out.println("winner: " + topDawg(-5, -2));
    }
}
