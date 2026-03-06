package Session_5;

public class Demo1 {
    public static void main(String[] args) {
        int a=5, b =3, c = 0;
        try {
            // Accessing different indices to make the logic meaningful
            a = Integer.parseInt(args[0]); 
            b = Integer.parseInt(args[1]); 
            
            c = a / b;
            System.out.println("Result c = " + c);
            
        }
        /*catch (ArrayIndexOutOfBoundsException e) {
            // Triggered if fewer than 2 arguments are provided
            System.out.println("Error: Please enter at least 2 values.");
            
        } catch (NumberFormatException e) {
            // Triggered if arguments are not valid integers
            System.out.println("Error: Please enter only integer values.");
            
        } catch (ArithmeticException e) {
            // Triggered if b is 0
            System.out.println("Error: Denominator should not be 0.");
            
        } catch (Exception e) {
            // Generic safety net for any other unexpected errors
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }   */
        catch (Exception e) {
        	if (e instanceof ArithmeticException) {
        		System.out.println("Denominator or should not be zero");
			}
        	else if(e instanceof ArrayIndexOutOfBoundsException){
        		System.out.println("Enter atleast two values");
        	}
        	else if (e instanceof ArrayIndexOutOfBoundsException) {
        		System.out.println("enter only integer values");
        	}
        	else {
        		System.out.println("Exception occoured");
        	}
        }
    }
}