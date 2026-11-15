import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("feed 10 numbers:");
        int evens = 0;
        int odds = 0;
        for (int i = 0; i < 10; i++) {
            int val = in.nextInt();
            if ((val & 1) == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("counted " + evens + " evens and " + odds + " odds");
        in.close();
    }
}
