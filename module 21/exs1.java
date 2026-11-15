public class exs1 {
    public static void main(String[] args) {
        int[][] map = {
            {7, 8, 9},
            {1, 2, 3}
        };
        int[][] flipped = new int[3][2];
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                flipped[c][r] = map[r][c];
            }
        }
        System.out.println("swapped grid:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(flipped[r][c] + " ");
            }
            System.out.println();
        }
    }
}
