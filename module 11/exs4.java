import java.util.Scanner;

public class exs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("drop huge number: ");
        long v = sc.nextLong();
        int len = 0;
        long copy = Math.abs(v);
        if (copy == 0) len = 1;
        while (copy > 0) {
            len++;
            copy /= 10;
        }
        System.out.println("that thing has " + len + " digits");
        sc.close();
    }
}
