public class exs5 {
    public static void scanExtremes(int[] pile) {
        int floor = pile[0];
        int roof = pile[0];
        for (int item : pile) {
            floor = Math.min(floor, item);
            roof = Math.max(roof, item);
        }
        System.out.println("bottom mark: " + floor + " | top mark: " + roof);
    }

    public static void main(String[] args) {
        int[] levels = {210, 45, 890, 12, 530};
        scanExtremes(levels);
    }
}
