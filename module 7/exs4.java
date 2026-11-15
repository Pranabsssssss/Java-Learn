import java.util.Scanner;

public class exs4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num1: ");
        double n1 = in.nextDouble();
        System.out.print("num2: ");
        double n2 = in.nextDouble();
        System.out.println("added: " + (n1 + n2));
        System.out.println("diff: " + (n1 - n2));
        System.out.println("mult: " + (n1 * n2));
        if (n2 != 0) {
            System.out.println("divided: " + (n1 / n2));
        } else {
            System.out.println("cant divide by zero dude");
        }
        in.close();
    }
}
