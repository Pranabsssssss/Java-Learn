import java.util.ArrayList;

public class exs4 {
    public static void main(String[] args) {
        ArrayList<String> shouts = new ArrayList<String>();
        shouts.add("gg");
        shouts.add("clutch");
        shouts.add("headshot");

        for (int i = 0; i < shouts.size(); i++) {
            shouts.set(i, shouts.get(i).toUpperCase());
        }
        System.out.println("pumped up: " + shouts);
    }
}
