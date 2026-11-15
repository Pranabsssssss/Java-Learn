public class exs2 {
    public static void main(String[] args) {
        int[] loot = {15, 30, 5, 80, 20};
        int bag = 0;
        for (int coin : loot) {
            bag += coin;
        }
        System.out.println("total loot collected: " + bag);
    }
}
