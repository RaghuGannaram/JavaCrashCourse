package threads;

public class ImplementsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World...!");
    }

    public static void main(String[] args) {
        Runnable runnableFn = new ImplementsRunnable();
        Thread thread = new Thread(runnableFn);

        thread.start();
    }
}
