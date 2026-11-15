import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("final pct score: ");
        double p = sc.nextDouble();
        if (p >= 90) {
            System.out.println("A tier goat");
        } else if (p >= 80) {
            System.out.println("B tier solid");
        } else if (p >= 70) {
            System.out.println("C tier safe");
        } else if (p >= 60) {
            System.out.println("D tier warning");
        } else {
            System.out.println("F failed big time");
        }
        sc.close();
    }
}
