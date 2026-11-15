import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("whats temp outside: ");
        float deg = in.nextFloat();
        String feel = (deg < 15) ? "freezing get a hoodie" : (deg <= 28 ? "pretty chill outside" : "sweating grab ice");
        System.out.println(feel);
        in.close();
    }
}
