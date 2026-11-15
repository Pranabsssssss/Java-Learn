import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("add up to what: ");
        int top = sc.nextInt();
        int acc = 0;
        for (int i = 1; i <= top; i++) {
            acc += i;
        }
        System.out.println("accumulated total is " + acc);
        sc.close();
    }
}
