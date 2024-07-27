package locks;

public class FaultyCounter {

    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating and starting threads to increment the count
        Thread t1 = new Thread(new CounterIncrementTask(counter));
        Thread t2 = new Thread(new CounterIncrementTask(counter));
        Thread t3 = new Thread(new CounterIncrementTask(counter));
        Thread t4 = new Thread(new CounterIncrementTask(counter));
        Thread t5 = new Thread(new CounterIncrementTask(counter));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Waiting for threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Printing the final count
        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    public void increment() {
        // Simulating a delay to illustrate the issue
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterIncrementTask implements Runnable {
    private final Counter counter;

    public CounterIncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}
