public class exs2 {
    public static void main(String[] args) {
        int[][] g1 = {
            {4, 7},
            {2, 9}
        };
        int[][] g2 = {
            {3, 1},
            {8, 5}
        };
        int[][] merged = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                merged[i][j] = g1[i][j] + g2[i][j];
            }
        }
        System.out.println("summed overlay:");
        for (int[] row : merged) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
