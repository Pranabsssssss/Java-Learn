public class exs4 {
    public static void main(String[] args) {
        String[] chapters = {"prologue", "rising", "climax", "epilogue"};
        String bookends = chapters[0] + " -> " + chapters[chapters.length - 1];
        System.out.println("ends hooked up: " + bookends);
    }
}
