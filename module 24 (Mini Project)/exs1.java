import java.util.ArrayList;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {"Milk", "Bread", "Eggs", "Rice", "Apples", "Chips"};
        int[] stock = {8, 12, 15, 20, 10, 25};

        ArrayList<String> cart = new ArrayList<>();

        int choice = 0;

        while (choice != 6) {

            System.out.println("\n*** GROCERY STORE MENU ***");
            System.out.println("1. View inventory");
            System.out.println("2. Add to cart");
            System.out.println("3. Remove from cart");
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("choose an option: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Current Inventory ---");
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i] + " - " + stock[i] + " left");
                    }
                    break;

                case 2:
                    System.out.print("enter item name to add: ");
                    String buyItem = sc.next();

                    boolean found = false;

                    for (int i = 0; i < items.length; i++) {
                        if (items[i].equalsIgnoreCase(buyItem)) {
                            found = true;
                            if (stock[i] > 0) {
                                cart.add(items[i]);
                                stock[i]--;
                                System.out.println(items[i] + " added to cart");
                            } else {
                                System.out.println("sorry out of stock");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("item not found in store");
                    }
                    break;

                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("cart is already empty");
                        break;
                    }

                    System.out.print("enter item name to remove: ");
                    String dropItem = sc.next();

                    boolean inCart = false;

                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).equalsIgnoreCase(dropItem)) {
                            String removedName = cart.remove(i);
                            inCart = true;

                            for (int j = 0; j < items.length; j++) {
                                if (items[j].equalsIgnoreCase(removedName)) {
                                    stock[j]++;
                                    break;
                                }
                            }

                            System.out.println(removedName + " removed from cart");
                            break;
                        }
                    }

                    if (!inCart) {
                        System.out.println("item not found in cart");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Items in Your Cart ---");
                    if (cart.isEmpty()) {
                        System.out.println("your cart is empty right now");
                    } else {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println((i + 1) + ". " + cart.get(i));
                        }
                        System.out.println("total items: " + cart.size());
                    }
                    break;

                case 5:
                    System.out.println("\n--- Checkout Summary ---");
                    if (cart.isEmpty()) {
                        System.out.println("cart is empty nothing to buy");
                    } else {
                        System.out.println("Items bought:");
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.println("- " + cart.get(i));
                        }
                        System.out.println("Total quantity: " + cart.size());

                        cart.clear();

                        System.out.println("\nUpdated Inventory after checkout:");
                        for (int i = 0; i < items.length; i++) {
                            System.out.println(items[i] + " - " + stock[i] + " left");
                        }

                        System.out.println("thank you for shopping with us");
                    }
                    break;

                case 6:
                    System.out.println("bye have a nice day");
                    break;

                default:
                    System.out.println("invalid choice enter 1 to 6");
            }
        }

        sc.close();
    }
}
