import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // Attempt division
            int result = a / b;

            // Print result if successful
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException e) {
            // Handle non-integer input
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println(e.getClass().getName());
        }

        scanner.close();
    }
}
