import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pick;
        do {
            System.out.println("9. drop secret");
            System.out.println("0. peace out");
            System.out.print("choose: ");
            pick = sc.nextInt();
            if (pick == 9) {
                System.out.println("java runs on billions of machines");
            }
        } while (pick != 0);
        System.out.println("see ya");
        sc.close();
    }
}
