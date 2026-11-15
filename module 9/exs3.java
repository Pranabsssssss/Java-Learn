import java.util.Scanner;

public class exs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("day slot (1 to 7): ");
        int d = sc.nextInt();
        switch (d) {
            case 1: System.out.println("mon grind begins"); break;
            case 2: System.out.println("tue keep pushing"); break;
            case 3: System.out.println("wed mid week hump"); break;
            case 4: System.out.println("thu almost there"); break;
            case 5: System.out.println("fri weekend mode soon"); break;
            case 6: System.out.println("sat game night"); break;
            case 7: System.out.println("sun dreading monday"); break;
            default: System.out.println("fake day number"); break;
        }
        sc.close();
    }
}
