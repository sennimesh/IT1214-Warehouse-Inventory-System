import java.util.Scanner;

public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n1.Add 2.Remove 3.Update 4.Search 5.View 0.Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Qty: ");
                    int qty = sc.nextInt();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    inventory.addItem(new Item(id, name, qty, price));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    inventory.removeItem(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    String uid = sc.nextLine();

                    System.out.print("New Qty: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(uid, newQty);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    System.out.println(inventory.searchById(sc.nextLine()));
                    break;

                case 5:
                    inventory.displayAll();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
