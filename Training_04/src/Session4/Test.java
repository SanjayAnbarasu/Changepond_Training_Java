package Session4;

class Test {
    private int rollNo;
    private String name;

    public Test(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
}

public class Test {
    public static void main(String[] args) {
        // 1. Declare and initialize the object first
        Student s1 = new Student(1, "Rahul");

        // 2. Print details (Removed 'final' keyword as it cannot be used on a statement)
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

        // 3. Reassigning s1 to a new Student object
        s1 = new Student(2, "Priyanka");
        
        System.out.println(s1.getName());
    }
}
