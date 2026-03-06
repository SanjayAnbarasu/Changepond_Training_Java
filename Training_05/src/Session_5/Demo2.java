package Session_5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        // 1. Corrected Writing Section
        try (FileOutputStream fos = new FileOutputStream("abc.txt")) {
            String str = "changed file";
            // Use getBytes() (plural) and primitive byte array
            byte b[] = str.getBytes(); 
            fos.write(b);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // 2. Corrected Reading Section
        try (FileInputStream fis = new FileInputStream("abc.txt")) {
            int i = 0;
            // FIX: Condition must be != -1
            while ((i = fis.read()) != -1) { 
                System.out.print((char) i);
            }
            System.out.println("\nSuccess");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
