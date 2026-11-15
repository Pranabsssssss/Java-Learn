public class exs3 {
    public static void main(String[] args) {
        String batch = "mississippi stream";
        char hunt = 's';
        int tally = 0;
        for (int k = 0; k < batch.length(); k++) {
            if (batch.charAt(k) == hunt) {
                tally++;
            }
        }
        System.out.println("spotted " + hunt + " about " + tally + " times");
    }
}
