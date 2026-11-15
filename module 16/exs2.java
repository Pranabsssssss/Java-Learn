import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("drop line to scan: ");
        String line = sc.nextLine().toLowerCase();
        int vCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vCount++;
            }
        }
        System.out.println("found " + vCount + " vowels inside");
        sc.close();
    }
}
