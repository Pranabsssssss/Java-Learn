import java.util.ArrayList;
import java.util.Scanner;

public class exs1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] storeItems = {"Milk", "Bread", "Eggs", "Rice", "Apples", "Chips"};
        int[] itemStock = {8, 12, 15, 20, 10, 25};

        ArrayList<String> myCart = new ArrayList<>();

        int option = 0;

        while (option != 6) {

            System.out.println("\n===== GROCERY STORE SYSTEM =====");
            System.out.println("1. View inventory");
            System.out.println("2. Add to cart");
            System.out.println("3. Remove from cart");
            System.out.println("4. View cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("choose an option: ");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("\n--- Current Inventory ---");
                    for (int i = 0; i < storeItems.length; i++) {
                        System.out.println(storeItems[i] + " : " + itemStock[i] + " available");
                    }
                    break;

                case 2:
                    System.out.print("enter item name to add: ");
                    String addItem = sc.next();

                    boolean itemFound = false;

                    for (int i = 0; i < storeItems.length; i++) {
                        if (storeItems[i].equalsIgnoreCase(addItem)) {
                            itemFound = true;
                            if (itemStock[i] > 0) {
                                myCart.add(storeItems[i]);
                                itemStock[i]--;
                                System.out.println(storeItems[i] + " added to cart");
                            } else {
                                System.out.println("sorry out of stock");
                            }
                            break;
                        }
                    }

                    if (!itemFound) {
                        System.out.println("item not found in store");
                    }
                    break;

                case 3:
                    if (myCart.isEmpty()) {
                        System.out.println("cart is empty");
                        break;
                    }

                    System.out.print("enter item name to remove: ");
                    String remItem = sc.next();

                    boolean foundInCart = false;

                    for (int i = 0; i < myCart.size(); i++) {
                        if (myCart.get(i).equalsIgnoreCase(remItem)) {
                            String popped = myCart.remove(i);
                            foundInCart = true;

                            for (int j = 0; j < storeItems.length; j++) {
                                if (storeItems[j].equalsIgnoreCase(popped)) {
                                    itemStock[j]++;
                                    break;
                                }
                            }

                            System.out.println(popped + " removed from cart");
                            break;
                        }
                    }

                    if (!foundInCart) {
                        System.out.println("item not found in cart");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cart Details ---");
                    if (myCart.isEmpty()) {
                        System.out.println("your cart is empty right now");
                    } else {
                        for (int i = 0; i < myCart.size(); i++) {
                            System.out.println((i + 1) + ". " + myCart.get(i));
                        }
                        System.out.println("total items: " + myCart.size());
                    }
                    break;

                case 5:
                    System.out.println("\n--- Final Checkout ---");
                    if (myCart.isEmpty()) {
                        System.out.println("cart is empty nothing to checkout");
                    } else {
                        System.out.println("Items bought:");
                        for (int i = 0; i < myCart.size(); i++) {
                            System.out.println("- " + myCart.get(i));
                        }
                        System.out.println("Total quantity: " + myCart.size());

                        myCart.clear();

                        System.out.println("\nRemaining Inventory Stock:");
                        for (int i = 0; i < storeItems.length; i++) {
                            System.out.println(storeItems[i] + " : " + itemStock[i] + " remaining");
                        }

                        System.out.println("thank you for shopping");
                    }
                    break;

                case 6:
                    System.out.println("thanks for visiting bye");
                    break;

                default:
                    System.out.println("invalid option try again");
            }
        }

        sc.close();
    }
}
