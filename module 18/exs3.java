public class exs3 {
    public static double gap(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        System.out.println("straight line distance: " + gap(2, 3, 7, 9));
        int roll = (int)(Math.random() * 20) + 1;
        System.out.println("d20 dice rolled: " + roll);
    }
}
