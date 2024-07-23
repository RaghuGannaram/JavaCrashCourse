/**
 * Demonstrates Exception Handling in Java.
 * Concepts Covered:
 * - Try, Catch, Finally
 * - Throw and Throws
 * - Custom Exceptions
 */

public class ExceptionHandlingCheatSheet {

    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException example
        int[] numbers = { 1, 2, 3 };
        try {
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }

        // Throw and Throws example
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        // Custom Exception example
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    /**
     * Method using throws to declare an exception.
     * 
     * @param age Age to be checked
     * @throws Exception if age is less than 18
     */
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            // Throwing an exception
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    /**
     * Method using a custom exception.
     * 
     * @param age Age to be validated
     * @throws InvalidAgeException if age is less than 18
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}

/**
 * Custom Exception class.
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
