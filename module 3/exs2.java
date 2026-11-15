public class exs2 {
    public static void main(String[] args) {
        String p1 = "ron"; int rank1 = 4; double pts1 = 88.5;
        String p2 = "ash"; int rank2 = 1; double pts2 = 97.0;
        String p3 = "kai"; int rank3 = 9; double pts3 = 71.4;

        System.out.printf("%-8s %-8s %-8s%n", "player", "rank", "score");
        System.out.printf("%-8s %-8d %-8.1f%n", p1, rank1, pts1);
        System.out.printf("%-8s %-8d %-8.1f%n", p2, rank2, pts2);
        System.out.printf("%-8s %-8d %-8.1f%n", p3, rank3, pts3);
    }
}
