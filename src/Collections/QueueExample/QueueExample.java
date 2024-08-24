package Collections.QueueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // FIFO [First In First Out]
         Queue<String> taskQueue = new LinkedList<>();

        // Görevleri kuyruga ekleme
        taskQueue.add("Task 1");
        taskQueue.add("Task 2");
        taskQueue.add("Task 3");

        // Görevleri işleme
        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll(); // dequeue
            System.out.println("Process: " + task);
        }
    }
}
