public class exs1 {
    static String clanName = "delta force";
    String handle;
    int kills;

    public void showStats() {
        int ping = 35;
        System.out.println("clan: " + clanName);
        System.out.println("gamer: " + handle + " got " + kills + " kills");
        System.out.println("current ping ms: " + ping);
    }

    public static void main(String[] args) {
        exs1 p = new exs1();
        p.handle = "vortex99";
        p.kills = 14;
        p.showStats();
    }
}
