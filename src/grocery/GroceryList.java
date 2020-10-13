package grocery;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroceryList {

    public static final ArrayList<String> CATEGORIES = new ArrayList<String>(
            Arrays.asList("meat", "dairy", "produce", "frozen", "canned", "bakery"));
    private final HashMap<String, GroceryItem> groceryList = new HashMap<>();

    public GroceryList(GroceryItem ...items) {
        for (GroceryItem item: items) {
            addItem(item);
        }
    }

    public static String selectCategory() {
        Input input = new Input();

        do {
            System.out.print("What category do you want to add to?");
            printCategories();
            System.out.print("> ");
            String category = input.getString().toLowerCase();

            if (CATEGORIES.contains(category)) {
                return category;
            } else {
                System.out.printf("\nInvalid Selection: %s\n\n", category);
            }

        } while (true);

    }

    public void addItem(GroceryItem item) {
        groceryList.put(item.getName(), item);
    }

    public HashMap<String, GroceryItem> getList() {
        return groceryList;
    }

    public static void printCategories() {
        System.out.print("\n");
        for (String category: CATEGORIES) {
            System.out.println(category);
        }
    }

    public void print() {
        for (GroceryItem item: this.getList().values()) {
            System.out.printf("Name: %s - Quantity: %d - Category: %s\n",
                    item.getName(), item.getQuantity(), item.getCategory());
        }
    }

}
