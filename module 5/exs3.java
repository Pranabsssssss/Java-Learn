public class exs3 {
    public static void main(String[] args) {
        int lives = 3;
        int potion = 10;
        int curLives = lives++;
        int extraPotion = ++potion;
        System.out.println("lives was " + curLives + " now " + lives);
        System.out.println("potion jumped to " + extraPotion);
        System.out.println("rem: " + (29 % 6));
        int smallVal = 42;
        double bigFloat = smallVal;
        System.out.println("cast up to float: " + bigFloat);
    }
}
