package grocery;

import util.Input;

public class GroceryApplication {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        Input input = new Input();

        do {
            String category = GroceryList.selectCategory();
            System.out.println("\nWhat are you adding to the list?");

            String itemName = input.getString();
            int itemQuantity = input.getInt(0, 100, "How many are you adding?");

            groceryList.addItem(new GroceryItem(itemName, itemQuantity, category));
            System.out.printf("\n%d %s added to the list\n\n", itemQuantity, itemName);

        } while (!input.yesNo("Are you ready to finalize the list?"));

        groceryList.print();
    }
}