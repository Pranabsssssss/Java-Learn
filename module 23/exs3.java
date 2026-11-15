import java.util.ArrayList;

public class exs3 {
    public static void main(String[] args) {
        ArrayList<String> gears = new ArrayList<String>();
        gears.add("sword");
        gears.add("shield");
        gears.add("bow");
        gears.add("shield");

        String target = "shield";
        String upgrade = "energy barrier";

        for (int i = 0; i < gears.size(); i++) {
            if (gears.get(i).equals(target)) {
                gears.set(i, upgrade);
            }
        }
        System.out.println("invent after re-gear: " + gears);
    }
}
