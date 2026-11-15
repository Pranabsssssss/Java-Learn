import java.util.ArrayList;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> squad = new ArrayList<String>();
        System.out.println("give 3 handles:");
        for (int i = 0; i < 3; i++) {
            squad.add(in.nextLine());
        }
        System.out.println("starting party: " + squad);
        squad.remove(1);
        System.out.println("party after kicking slot 1: " + squad);
        in.close();
    }
}
