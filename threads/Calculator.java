package threads;

public class Calculator {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        Thread additionThread = new Thread(new Addition(a, b));
        Thread subtractionThread = new Thread(new Subtraction(a, b));

        additionThread.start();
        subtractionThread.start();
    }
}

class Addition implements Runnable {
    int a;
    int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int res = this.a + this.b;
        System.out.println("The Addition result : " + res);
    }
}

class Subtraction implements Runnable {
    int a;
    int b;

    public Subtraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int res = a - b;
        System.out.println("The Subtraction result : " + res);
    }
}
