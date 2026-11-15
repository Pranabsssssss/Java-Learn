public class exs1 {
    public static void main(String[] args) {
        String log = "system error detected at sector 7";
        System.out.println("slice: " + log.substring(7, 12));
        System.out.println("swapped: " + log.replace("error", "warning"));
        System.out.println("contains alert keyword? " + log.contains("sector"));
    }
}
