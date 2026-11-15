import java.util.ArrayList;

public class exs2 {
    public static void main(String[] args) {
        ArrayList<Integer> ammo = new ArrayList<Integer>();
        ammo.add(30);
        ammo.add(60);
        ammo.add(90);
        ammo.add(120);
        System.out.println("initial mags: " + ammo);
        ammo.remove(2);
        System.out.println("after discard: " + ammo);
        System.out.println("slots left: " + ammo.size());
    }
}
