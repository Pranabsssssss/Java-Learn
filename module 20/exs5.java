public class exs5 {
    public static void main(String[] args) {
        int[] deck = new int[6];
        int pot = 0;
        System.out.print("dealt cards: ");
        for (int i = 0; i < deck.length; i++) {
            deck[i] = (int)(Math.random() * 50) + 1;
            pot += deck[i];
            System.out.print(deck[i] + " ");
        }
        System.out.println("
total chips in pot: " + pot);
    }
}
