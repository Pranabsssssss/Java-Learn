public class exs3 {
    public static void main(String[] args) {
        String one = "robot";
        String two = "ROBOT";
        String three = new String("robot");

        System.out.println("identity pointer match: " + (one == three));
        System.out.println("strict value equal: " + one.equals(three));
        System.out.println("case blind equal: " + one.equalsIgnoreCase(two));
    }
}
