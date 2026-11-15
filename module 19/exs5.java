public class exs5 {
    public static int clash(int[] arr, int p1, int p2) {
        return Math.max(arr[p1], arr[p2]);
    }

    public static void main(String[] args) {
        int[] power = {350, 780, 510, 920, 640};
        int high = clash(power, 0, 3);
        System.out.println("slot 0 (" + power[0] + ") vs slot 3 (" + power[3] + ") winner: " + high);
    }
}
