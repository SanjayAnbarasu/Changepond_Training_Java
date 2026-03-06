package Task;

import java.util.Scanner;

// Student class implementing the Interface
class Student implements StudentFee {
    private String name;
    private double fees;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void getFee() throws InvalidFeeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fees for " + name + ": ");
        
        // Read input
        if (!sc.hasNextDouble()) {
            throw new InvalidFeeException("Invalid input: Please enter a numeric value.");
        }
        
        double inputFee = sc.nextDouble();

        // Validation logic
        if (inputFee < 0) {
            throw new InvalidFeeException("Fee cannot be negative: " + inputFee);
        }

        this.fees = inputFee;
        System.out.println("Fee updated successfully for " + name);
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Fees: " + fees);
    }
    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("John Doe");

            try {
                s1.getFee();
                s1.displayDetails();
            } catch (InvalidFeeException e) {
                // This catches the error if the user enters a negative number
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

}
