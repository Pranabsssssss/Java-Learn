public class exs4 {
    public static void main(String[] args) {
        int[] track = {5, 15, 25, 35, 45, 55};
        int start = 0;
        int end = track.length - 1;
        while (start < end) {
            System.out.println("pair (" + track[start] + " + " + track[end] + ") sums to " + (track[start] + track[end]));
            start++;
            end--;
        }
    }
}
