package grocery;

import util.Input;

import java.lang.reflect.Array;
import java.util.*;

public class GroceryList {

    public static List<String> CATEGORIES = Arrays.asList("meat", "dairy", "produce", "frozen", "canned", "bakery");
    private final HashMap<String, GroceryItem> groceryList = new HashMap<>();

    public GroceryList(GroceryItem... items) {
        Collections.sort(CATEGORIES);
        for (GroceryItem item : items) {
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
        for (String category : CATEGORIES) {
            System.out.println(category);
        }
    }

    public void print() {
        for (String category : CATEGORIES) {

            List<String> list = new ArrayList<>();

            for (GroceryItem item : this.getList().values()) {
                if (item.getCategory().equalsIgnoreCase(category)) {
                    list.add(item.getName());
                }
            }
            Collections.sort(list);

            if (list.size() > 0) {
                System.out.printf("=====%s=====\n", category);
                for (String str : list) {
                    GroceryItem item = groceryList.get(str);

                    System.out.printf("Name: %s - Quantity: %d\n",
                            item.getName(), item.getQuantity());
                }
                System.out.print("\n");
            }
        }

    }
}