package Task;
import java.util.Scanner;
public class TestProduct {
	  public static double calculateTotalAmount(Product[] products) {
	        double total = 0;
	        for (Product p : products) {
	            total += (p.price * p.quantity);
	        }
	        return total;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Product[] products = new Product[5];

	        // a. Accept five product information from user
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for product " + (i + 1) + " (ID, Price, Quantity):");
	            int id = sc.nextInt();
	            double price = sc.nextDouble();
	            int qty = sc.nextInt();
	            products[i] = new Product(id, price, qty);
	        }

	        // b. Find Pid of product with highest price
	        double maxPrice = products[0].price;
	        int maxPid = products[0].pid;
	        for (int i = 1; i < products.length; i++) {
	            if (products[i].price > maxPrice) {
	                maxPrice = products[i].price;
	                maxPid = products[i].pid;
	            }
	        }
	        System.out.println("PID of product with highest price: " + maxPid);

	        // c. Calculate and return total amount spent
	        double totalAmount = calculateTotalAmount(products);
	        System.out.println("Total amount spent on all products: " + totalAmount);
	        
	        sc.close();
	    }
}
