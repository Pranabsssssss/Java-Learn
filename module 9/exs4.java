import java.util.Scanner;

public class exs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cart total: ");
        double cost = sc.nextDouble();
        double cut = 0;
        if (cost >= 4000) {
            cut = cost * 0.25;
        } else if (cost >= 2000) {
            cut = cost * 0.15;
        } else if (cost >= 1000) {
            cut = cost * 0.05;
        }
        System.out.println("saved " + cut + " bucks so pay " + (cost - cut));
        sc.close();
    }
}
