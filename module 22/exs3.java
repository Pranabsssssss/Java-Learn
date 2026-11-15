import java.util.ArrayList;

public class exs3 {
    public static void main(String[] args) {
        String[] tags = {"phoenix", "valkyrie", "omen"};
        ArrayList<String> list = new ArrayList<String>();
        for (String t : tags) {
            list.add(t);
        }
        System.out.println("unpacked into arraylist: " + list);
    }
}
