public class exs2 {
    public static void main(String[] args) {
        boolean hasPass = false;
        boolean isVip = true;
        boolean friendOnList = false;
        boolean canEnterClub = hasPass || isVip || friendOnList;
        System.out.println("gets in door: " + canEnterClub);
    }
}
