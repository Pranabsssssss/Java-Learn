import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("word test: ");
        String w = in.nextLine();
        String back = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            back += w.charAt(i);
        }
        if (w.equalsIgnoreCase(back)) {
            System.out.println(w + " mirror match symmetry confirmed");
        } else {
            System.out.println(w + " nope not symmetric");
        }
        in.close();
    }
}
