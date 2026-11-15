public class exs1 {
    public static void main(String[] args) {
        double roomW = 14.2;
        double roomL = 19.8;
        double carpetArea = roomW * roomL;
        double borderTrim = 2 * (roomW + roomL);
        System.out.println("carpet needed: " + carpetArea);
        System.out.println("border length: " + borderTrim);
    }
}
