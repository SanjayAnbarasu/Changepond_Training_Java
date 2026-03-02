public class ArrDemo {
    public static void main(String[] args) {
        // Initialization of a jagged array
        int a[][] = {
            {1, 2},
            {3, 4, 5},
            {5, 6, 7, 8}
        };

        // Outer loop: iterates through each row
        for (int i = 0; i < a.length; i++) {
            // Inner loop: iterates through each element in the current row
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            // Move to a new line after printing each row
            System.out.println();
        }
    }
}
