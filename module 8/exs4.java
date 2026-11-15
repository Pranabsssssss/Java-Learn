import java.util.Scanner;

public class exs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your test points: ");
        double pt = sc.nextDouble();
        if (pt >= 40) {
            System.out.println("barely passed or crushed it either way u clear");
        } else {
            System.out.println("oof didn't make cut retry needed");
        }
        sc.close();
    }
}
