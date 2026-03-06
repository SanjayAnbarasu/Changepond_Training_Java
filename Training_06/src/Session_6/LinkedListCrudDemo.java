package Session_6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCrudDemo {
    public static void main(String[] args) {
        // Standard naming: using 'list' (lowercase) is better practice
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCRUD demo");
            System.out.println("1. Add Element (Create)");
            System.out.println("2. View Element (Read)");
            System.out.println("3. Update element");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Element to Add: ");
                    String element = sc.next();
                    list.add(element);
                    System.out.println("Element added Successfully");
                    break;

                case 2:
                    System.out.println("List Elements as Follows:");
                    // FIX: Added curly braces for the loop and removed 'i < list.size()' logic errors
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + " " + list.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter the index to be updated: ");
                    int index = sc.nextInt();
                    // FIX: Added the 'if' condition to validate the index range
                    if (index >= 0 && index < list.size()) {
                        System.out.print("Enter new value: ");
                        String newValue = sc.next();
                        list.set(index, newValue);
                        System.out.println("Element updated");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to Delete: ");
                    int index1 = sc.nextInt();
                    // FIX: Added the 'if' condition to prevent IndexOutOfBoundsException
                    if (index1 >= 0 && index1 < list.size()) {
                        list.remove(index1);
                        System.out.println("Element Deleted");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                // FIX: Moved 'default' inside the switch block curly braces
                default:
                    System.out.println("You have entered the wrong choice");
                    break;
            }
        } while (choice != 5);
        
        sc.close();
    }
}
