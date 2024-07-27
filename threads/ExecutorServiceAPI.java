package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceAPI {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Hello World...!"));
        executor.submit(() -> System.out.println("Hello Java...!"));

        executor.shutdown();
    }
}
