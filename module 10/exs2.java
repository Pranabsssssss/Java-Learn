import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("pick a multiplier: ");
        int k = sc.nextInt();
        for (int row = 1; row <= 10; row++) {
            System.out.println(k + " times " + row + " gives " + (k * row));
        }
        sc.close();
    }
}
