public class exs3 {
    public static void tweak(int meter) {
        meter += 100;
        System.out.println("in tweak func: " + meter);
    }

    public static void main(String[] args) {
        int stamina = 45;
        tweak(stamina);
        System.out.println("back in main unchanged: " + stamina);
    }
}
