import java.util.List;
import java.util.Arrays;

public class LambdaExpressionCheatSheet {

    @FunctionalInterface
    public interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        /*
         * 1. Lambda Expression with Functional Interface
         */
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(10, 20));

        /*
         * 2. Lambda Expression with Runnable Interface
         * Note: Runnable is a functional interface with a single abstract method run().
         * run() won't take any arguments and won't return anything.
         */
        Runnable greet = () -> {
            System.out.println("Hello World...!");
        };
        Thread thread = new Thread(greet);
        thread.start();

        /*
         * 3. Lambda Expression with Collections
         */
        List<String> names = Arrays.asList("John", "James", "Jane", "Jill", "Jack");
        names.forEach(name -> System.out.println(name));

        /*
         * 4. Lambda Expression with Stream API
         */
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().map(n -> n * n).forEach(System.out::println);

    }
}