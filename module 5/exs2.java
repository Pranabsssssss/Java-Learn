public class exs2 {
    public static void main(String[] args) {
        double phoneBuy = 18000;
        double watchBuy = 4500;
        double phoneSold = phoneBuy * 0.88;
        double watchSold = watchBuy * 1.30;
        double cashSpent = phoneBuy + watchBuy;
        double cashGot = phoneSold + watchSold;
        double balance = cashGot - cashSpent;

        if (balance > 0) {
            System.out.println("up by " + balance + " bucks");
        } else if (balance < 0) {
            System.out.println("down by " + (-balance) + " bucks rip");
        } else {
            System.out.println("broke even");
        }
    }
}
