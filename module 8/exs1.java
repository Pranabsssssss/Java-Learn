import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("drop any number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is totally even");
        } else {
            System.out.println(num + " is odd as hell");
        }
        sc.close();
    }
}
