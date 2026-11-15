public class exs1 {
    public static void main(String[] args) {
        String[] lineup = {"neo", "trinity", "morpheus"};
        System.out.println("original center: " + lineup[1]);
        lineup[1] = "cypher";
        System.out.print("new crew roster: ");
        for (String m : lineup) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
