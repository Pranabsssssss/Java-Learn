public class exs2 {
    public static void main(String[] args) {
        int[] pingLogs = {84, 19, 142, 6, 95, 33};
        int lowest = pingLogs[0];
        int peak = pingLogs[0];
        for (int i = 1; i < pingLogs.length; i++) {
            if (pingLogs[i] < lowest) lowest = pingLogs[i];
            if (pingLogs[i] > peak) peak = pingLogs[i];
        }
        System.out.println("best ping: " + lowest + "ms");
        System.out.println("worst spike: " + peak + "ms");
    }
}
