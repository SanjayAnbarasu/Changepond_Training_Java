public class Person {
    // Properties
    private String name;
    private int age = 18; // Default age is 18 (Requirement a)

    // Constructor to initialize name and age (Requirement b)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age (Requirement c)
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Example of initialization
        Person p1 = new Person("John Doe", 25);
        p1.display();
    }
}
