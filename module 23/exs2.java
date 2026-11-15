import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> seq = new ArrayList<Integer>();
        System.out.println("drop 10 numbers to flip:");
        for (int i = 0; i < 10; i++) {
            seq.add(sc.nextInt());
        }
        System.out.println("as entered: " + seq);
        Collections.reverse(seq);
        System.out.println("backwards: " + seq);
        sc.close();
    }
}
