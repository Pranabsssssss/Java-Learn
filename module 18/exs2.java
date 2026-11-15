import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("side x: ");
        double sx = sc.nextDouble();
        System.out.print("side y: ");
        double sy = sc.nextDouble();
        double diagonal = Math.hypot(sx, sy);
        System.out.println("hypot calculated: " + diagonal);
        sc.close();
    }
}
