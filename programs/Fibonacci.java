package programs;

import java.util.Scanner;

public class Fibonacci {

    // Method to generate Fibonacci sequence
    public static long[] generateFibonacciOne(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Number of terms must be positive.");

        long[] fib = new long[n];

        // Initialize the first two terms
        if (n > 0)
            fib[0] = 0;
        if (n > 1)
            fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");

        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter a positive integer: ");
            sc.next();
        }

        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long[] fib = generateFibonacciOne(n);

        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        for (long num : fib) {
            System.out.println(num);
        }
    }
}
