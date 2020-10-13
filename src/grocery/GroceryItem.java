package grocery;

public class GroceryItem {
    private String name, category;
    private int quantity;

    public GroceryItem(String name, int quantity, String category) {
        setName(name);
        setCategory(category);
        setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }
}
