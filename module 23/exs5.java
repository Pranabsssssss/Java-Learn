import java.util.ArrayList;

public class exs5 {
    public static void main(String[] args) {
        ArrayList<Integer> rowA = new ArrayList<Integer>();
        ArrayList<Integer> rowB = new ArrayList<Integer>();

        rowA.add(3); rowA.add(6); rowA.add(9);
        rowB.add(2); rowB.add(5); rowB.add(10);

        System.out.print("multiplied across: ");
        for (int i = 0; i < rowA.size(); i++) {
            System.out.print((rowA.get(i) * rowB.get(i)) + " ");
        }
        System.out.println();
    }
}
