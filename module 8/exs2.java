import java.util.Scanner;

public class exs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("check what year: ");
        int yr = sc.nextInt();
        if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
            System.out.println(yr + " got 366 days leap year baby");
        } else {
            System.out.println(yr + " regular boring 365 days");
        }
        sc.close();
    }
}
