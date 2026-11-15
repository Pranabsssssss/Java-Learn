public class exs5 {
    public static void main(String[] args) {
        double examPts = 94.0;
        int attendedDays = 85;
        boolean gotFreeRide = (examPts >= 90) && (attendedDays >= 80);
        System.out.println("grant approved: " + gotFreeRide);
    }
}
