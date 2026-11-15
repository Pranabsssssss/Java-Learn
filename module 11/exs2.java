import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("feed some digits: ");
        int raw = sc.nextInt();
        int flipped = 0;
        int dummy = Math.abs(raw);
        while (dummy > 0) {
            flipped = (flipped * 10) + (dummy % 10);
            dummy /= 10;
        }
        if (raw < 0) flipped = -flipped;
        System.out.println("spun around: " + flipped);
        sc.close();
    }
}
