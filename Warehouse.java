import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Connect Inventory class
        Inventory inventory = new Inventory(100);

        int choice;

        do {
            System.out.println("\n=== Warehouse System ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    // Connect Item + Inventory
                    Item item = new Item(id, name, qty, price);
                    inventory.addItem(item);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter New Quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(updateId, newQty);
                    break;

                case 4:
                    System.out.println("1. Search by ID");
                    System.out.println("2. Search by Name");
                    int option = sc.nextInt();
                    sc.nextLine();

                    if (option == 1) {
                        System.out.print("Enter ID: ");
                        Item found = inventory.searchById(sc.nextLine());

                        if (found != null) {
                            System.out.println(found);
                        } else {
                            System.out.println("Item not found.");
                        }
                    } else {
                        System.out.print("Enter Name: ");
                        inventory.searchByName(sc.nextLine());
                    }
                    break;

                case 5:
                    inventory.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
