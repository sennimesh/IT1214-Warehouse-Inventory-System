import java.util.*;

public class Inventory {
    private Map<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        if (items.containsKey(item.getItemId())) {
            System.out.println("Item already exists!");
            return;
        }
        items.put(item.getItemId(), item);
        System.out.println("Item added.");
    }

    public void removeItem(String id) {
        if (items.remove(id) != null)
            System.out.println("Item removed.");
        else
            System.out.println("Item not found.");
    }

    public void updateQuantity(String id, int qty) {
        Item item = items.get(id);
        if (item != null) {
            item.setQuantity(qty);
            System.out.println("Updated successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public Item searchById(String id) {
        return items.get(id);
    }

    public void displayAll() {
        if (items.isEmpty()) {
            System.out.println("Inventory empty.");
            return;
        }
        items.values().forEach(System.out::println);
    }
}
