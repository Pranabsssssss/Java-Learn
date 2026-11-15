import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("whats ur tag: ");
        String handle = in.nextLine();
        System.out.print("ur level: ");
        int lvl = in.nextInt();
        System.out.println("sup " + handle + " lvl " + lvl + " registered");
        in.close();
    }
}
