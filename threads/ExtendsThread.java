package threads;

public class ExtendsThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World...!");
    }

    public static void main(String[] args) {
        Thread thread = new ExtendsThread();

        thread.start();
    }
}
