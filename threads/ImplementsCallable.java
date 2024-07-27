package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ImplementsCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello World...!";
    }

    public static void main(String[] args) {
        ImplementsCallable implementsCallableFn = new ImplementsCallable();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(implementsCallableFn);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println(e);
        } finally {
            executor.shutdown();
        }
    }
}
