public class exs2 {
    public static double calcCover(double rad) {
        return Math.PI * rad * rad;
    }

    public static double calcCover(double w, double h) {
        return w * h;
    }

    public static void main(String[] args) {
        System.out.println("radial patch: " + calcCover(3.2));
        System.out.println("flat rect: " + calcCover(10.0, 4.5));
    }
}
