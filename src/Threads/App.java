package Threads;

public class App {
    public static void main(String[] args) {

        // Create a Thread
        Threads t = new Threads("Hello");
        Threads t1 = new Threads("Hello");
        t.run();
        t1.run();
    }
}