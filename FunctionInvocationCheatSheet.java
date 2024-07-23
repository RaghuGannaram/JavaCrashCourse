import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInvocationCheatSheet {

    /*
     * Static method example
     * Static method to print uppercase names using method reference.
     * Syntax: static void methodName(List<String> names)
     * Example: FunctionInvocationDemo.printUpperCaseNamesStatic(names)
     * Function signature: static void printUpperCaseNamesStatic(List<String> names)
     * Parameters: List<String> names
     * Return Type: void
     */
    public static void printUpperCaseNamesStatic(List<String> names) {
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names (Static Method Call): " + upperCaseNames);
    }

    /*
     * Instance method example
     * Instance method to print uppercase names using lambda expression.
     * Syntax: void methodName(List<String> names)
     * Example: demoInstance.printUpperCaseNamesInstance(names)
     * Function signature: void printUpperCaseNamesInstance(List<String> names)
     * Parameters: List<String> names
     * Return Type: void
     */
    public void printUpperCaseNamesInstance(List<String> names) {
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Names (Instance Method Call): " + upperCaseNames);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        /*
         * 1. Method Reference
         * A method reference is a shorthand notation of a lambda expression to call a
         * method.
         * It directly refers to a method of a class or instance.
         * Syntax: ClassName::methodName
         * Example: String::toUpperCase
         * Function signature: String toUpperCase()
         * Parameters: None
         * Return Type: String
         */
        List<String> upperCaseNamesMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase Names (Method Reference): " + upperCaseNamesMethodRef);

        /*
         * 2. Lambda Expression
         * A lambda expression provides the implementation of a functional interface
         * using an expression.
         * Syntax: (parameters) -> expression
         * Example: s -> s.toUpperCase()
         * Function signature: String apply(String s)
         * Parameters: String s
         * Return Type: String
         */
        List<String> upperCaseNamesLambda = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Uppercase Names (Lambda Expression): " + upperCaseNamesLambda);

        /*
         * 3. Anonymous Class
         * An anonymous class is an inner class with no name, used to instantiate
         * objects of classes or interfaces.
         * Syntax: new InterfaceName() { ... }
         * Example: new Function<String, String>() { ... }
         * Function signature: String apply(String s)
         * Parameters: String s
         * Return Type: String
         */
        List<String> upperCaseNamesAnonClass = names.stream()
                .map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Uppercase Names (Anonymous Class): " + upperCaseNamesAnonClass);

        /*
         * 4. Static Method Call
         * Static methods are called directly using the class name.
         * Syntax: ClassName.methodName(arguments)
         * Example: FunctionInvocationDemo.printUpperCaseNamesStatic(names)
         * Function signature: static void printUpperCaseNamesStatic(List<String> names)
         * Parameters: List<String> names
         * Return Type: void
         */
        printUpperCaseNamesStatic(names);

        /*
         * 5. Instance Method Call
         * Instance methods are called on an instance of a class.
         * Syntax: instance.methodName(arguments)
         * Example: demoInstance.printUpperCaseNamesInstance(names)
         * Function signature: void printUpperCaseNamesInstance(List<String> names)
         * Parameters: List<String> names
         * Return Type: void
         */
        FunctionInvocationCheatSheet demoInstance = new FunctionInvocationCheatSheet();
        demoInstance.printUpperCaseNamesInstance(names);
    }
}
