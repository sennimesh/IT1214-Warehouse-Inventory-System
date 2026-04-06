public class Inventory {
    private Item[] items;
    private int count;

    // Constructor
    public Inventory(int size) {
        items = new Item[size]; // fixed size array
        count = 0;
    }

    // Add item
    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("Inventory is full!");
            return;
        }

        // check duplicate ID
        for (int i = 0; i < count; i++) {
            if (items[i].getItemId().equals(item.getItemId())) {
                System.out.println("Item already exists!");
                return;
            }
        }

        items[count] = item;
        count++;
        System.out.println("Item added successfully.");
    }

    // Remove item
    public void removeItem(String itemId) {
        for (int i = 0; i < count; i++) {
            if (items[i].getItemId().equals(itemId)) {

                // shift elements left
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                }

                items[count - 1] = null;
                count--;

                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Update quantity
    public void updateQuantity(String itemId, int quantity) {
        for (int i = 0; i < count; i++) {
            if (items[i].getItemId().equals(itemId)) {
                items[i].setQuantity(quantity);
                System.out.println("Quantity updated.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Search by ID
    public Item searchById(String itemId) {
        for (int i = 0; i < count; i++) {
            if (items[i].getItemId().equals(itemId)) {
                return items[i];
            }
        }
        return null;
    }

    // Search by Name
    public void searchByName(String name) {
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (items[i].getItemName().equalsIgnoreCase(name)) {
                System.out.println(items[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Display all items
    public void displayAll() {
        if (count == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
