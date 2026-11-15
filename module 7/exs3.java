import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("student handle: ");
        String s = in.nextLine();
        System.out.print("sub1: ");
        double a = in.nextDouble();
        System.out.print("sub2: ");
        double b = in.nextDouble();
        System.out.print("sub3: ");
        double c = in.nextDouble();
        double avg = (a + b + c) / 3;
        System.out.println(s + " sitting at " + avg + " average");
        in.close();
    }
}
