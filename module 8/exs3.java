import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter balance: ");
        double money = sc.nextDouble();
        if (money > 0) {
            System.out.println("we in the green");
        } else if (money < 0) {
            System.out.println("debt territory alert");
        } else {
            System.out.println("flat zero empty pockets");
        }
        sc.close();
    }
}
