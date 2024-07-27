package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.ArrayList;

public class CompletableFutureExample {

    // Simulates fetching data from a database
    public static CompletableFuture<List<String>> fetchDataFromDatabase() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulating delay
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            // Simulated data
            List<String> data = new ArrayList<>();
            data.add("Data1");
            data.add("Data2");
            data.add("Data3");
            return data;
        });
    }

    // Simulates processing data
    public static CompletableFuture<List<String>> processData(List<String> data) {
        return CompletableFuture.supplyAsync(() -> {
            // Simulating processing
            List<String> processedData = new ArrayList<>();
            for (String item : data) {
                processedData.add(item.toUpperCase());
            }
            return processedData;
        });
    }

    // Simulates saving data to a file
    public static CompletableFuture<Void> saveDataToFile(List<String> data) {
        return CompletableFuture.runAsync(() -> {
            try {
                // Simulating file writing
                Thread.sleep(1000);
                System.out.println("Data saved to file: " + data);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

    public static void main(String[] args) {
        // Creating a thread pool for handling asynchronous tasks
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Fetch data from database
        CompletableFuture<List<String>> fetchFuture = fetchDataFromDatabase();

        // Process data and save it to a file
        fetchFuture.thenCompose(data -> processData(data))
                .thenCompose(processedData -> saveDataToFile(processedData))
                .thenRun(() -> System.out.println("All tasks completed successfully."));

        // Shutdown the executor service
        executor.shutdown();
    }
}
