public class exs3 {
    public static void main(String[] args) {
        int x = 112;
        int y = 430;
        int z = 250;
        int champ = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("biggest one is " + champ);
    }
}
