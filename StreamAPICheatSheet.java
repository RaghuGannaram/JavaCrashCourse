import java.util.*;
import java.util.stream.*;

public class StreamAPICheatSheet {

    public static void main(String[] args) {
        // Sample data
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "John", "Jane");

        /*
         * filter
         * Filters elements based on a predicate.
         * Signature: Stream<T> filter(Predicate<? super T> predicate)
         * Parameters:
         * - Predicate<? super T> predicate: a function that returns true or false for
         * each element
         * Returns:
         * - Stream<T>: a new stream with elements that match the predicate
         * Example: Filter names that start with 'J'
         */
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        /*
         * map
         * Transforms elements using a function.
         * Signature: <R> Stream<R> map(Function<? super T, ? extends R> mapper)
         * Parameters:
         * - Function<? super T, ? extends R> mapper: a function to apply to each
         * element
         * Returns:
         * - Stream<R>: a new stream with transformed elements
         * Example: Convert all names to uppercase
         */
        List<String> uppercasedNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercased Names: " + uppercasedNames);

        /*
         * distinct
         * Removes duplicate elements.
         * Signature: Stream<T> distinct()
         * Parameters:
         * - None
         * Returns:
         * - Stream<T>: a new stream with unique elements
         * Example: Remove duplicates
         */
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        /*
         * sorted
         * Sorts elements.
         * Signature: Stream<T> sorted()
         * Signature: Stream<T> sorted(Comparator<? super T> comparator)
         * Parameters:
         * - Comparator<? super T> comparator (optional): a comparator for custom
         * sorting
         * Returns:
         * - Stream<T>: a new stream with sorted elements
         * Example: Sort names alphabetically
         */
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        /*
         * limit
         * Limits the number of elements.
         * Signature: Stream<T> limit(long maxSize)
         * Parameters:
         * - long maxSize: the maximum number of elements to return
         * Returns:
         * - Stream<T>: a new stream with a limited number of elements
         * Example: Limit to first 3 names
         */
        List<String> limitedNames = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited Names: " + limitedNames);

        /*
         * skip
         * Skips the first n elements.
         * Signature: Stream<T> skip(long n)
         * Parameters:
         * - long n: the number of elements to skip
         * Returns:
         * - Stream<T>: a new stream with skipped elements
         * Example: Skip first 2 names
         */
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped Names: " + skippedNames);

        /*
         * reduce
         * Performs a reduction on the elements using an associative accumulation
         * function.
         * Signature: <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator,
         * BinaryOperator<U> combiner)
         * Signature: Optional<T> reduce(BinaryOperator<T> accumulator)
         * Parameters:
         * - U identity: an initial value
         * - BiFunction<U, ? super T, U> accumulator: a function to accumulate elements
         * - BinaryOperator<U> combiner: a function to combine results
         * Returns:
         * - U: the reduced result, or Optional<T> for optional reduction
         * Example: Concatenate all names
         */
        String concatenatedNames = names.stream()
                .reduce("", (partialString, element) -> partialString + element + " ", String::concat);
        System.out.println("Concatenated Names: " + concatenatedNames);

        /*
         * forEach
         * Performs an action for each element.
         * Signature: void forEach(Consumer<? super T> action)
         * Parameters:
         * - Consumer<? super T> action: a function to apply to each element
         * Returns:
         * - void
         * Example: Print each name
         */
        System.out.println("All Names:");
        names.stream().forEach(System.out::println);

        /*
         * collect
         * Collects elements into a collection.
         * Signature: <R, A> R collect(Collector<? super T, A, R> collector)
         * Parameters:
         * - Collector<? super T, A, R> collector: a collector to accumulate elements
         * Returns:
         * - R: the result of the collection
         * Example: Collect names into a Set
         */
        Set<String> namesSet = names.stream()
                .collect(Collectors.toSet());
        System.out.println("Names Set: " + namesSet);

        /*
         * anyMatch
         * Checks if any elements match the given predicate.
         * Signature: boolean anyMatch(Predicate<? super T> predicate)
         * Parameters:
         * - Predicate<? super T> predicate: a predicate to test elements
         * Returns:
         * - boolean: true if any elements match, false otherwise
         * Example: Check if any name starts with 'J'
         */
        boolean hasJ = names.stream()
                .anyMatch(name -> name.startsWith("J"));
        System.out.println("Any name starts with 'J': " + hasJ);

        /*
         * allMatch
         * Checks if all elements match the given predicate.
         * Signature: boolean allMatch(Predicate<? super T> predicate)
         * Parameters:
         * - Predicate<? super T> predicate: a predicate to test elements
         * Returns:
         * - boolean: true if all elements match, false otherwise
         * Example: Check if all names are not empty
         */
        boolean allNotEmpty = names.stream()
                .allMatch(name -> !name.isEmpty());
        System.out.println("All names are not empty: " + allNotEmpty);

        /*
         * noneMatch
         * Checks if no elements match the given predicate.
         * Signature: boolean noneMatch(Predicate<? super T> predicate)
         * Parameters:
         * - Predicate<? super T> predicate: a predicate to test elements
         * Returns:
         * - boolean: true if no elements match, false otherwise
         * Example: Check if no name is null
         */
        boolean noneNull = names.stream()
                .noneMatch(Objects::isNull);
        System.out.println("No name is null: " + noneNull);

        /*
         * findFirst
         * Finds the first element.
         * Signature: Optional<T> findFirst()
         * Parameters:
         * - None
         * Returns:
         * - Optional<T>: an optional containing the first element, or empty if no
         * element is present
         * Example: Find the first name
         */
        Optional<String> firstName = names.stream()
                .findFirst();
        System.out.println("First Name: " + firstName.orElse("No names available"));

        /*
         * findAny
         * Finds any element.
         * Signature: Optional<T> findAny()
         * Parameters:
         * - None
         * Returns:
         * - Optional<T>: an optional containing any element, or empty if no element is
         * present
         * Example: Find any name
         */
        Optional<String> anyName = names.stream()
                .findAny();
        System.out.println("Any Name: " + anyName.orElse("No names available"));
    }
}
