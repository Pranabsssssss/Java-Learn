import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how old r u: ");
        int yr = sc.nextInt();
        String out = (yr >= 18) ? "u good to vote go ahead" : "too young wait few more yrs";
        System.out.println(out);
        sc.close();
    }
}
