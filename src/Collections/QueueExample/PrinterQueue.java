package Collections.QueueExample;
import java.util.LinkedList;
import java.util.Queue;

// A class to simulate a printer queue system
public class PrinterQueue {
    // Queue to hold print jobs
    private Queue<String> printQueue = new LinkedList<>();
    
    // Method to add a print job to the queue
    public void addPrintJob(String job) {
        printQueue.add(job);  // Add the job to the end of the queue
        System.out.println("Print job added: " + job);
    }

    // Method to process and print jobs from the queue
    public void processPrintJobs() {
        System.out.println("Processing print jobs:");
        while (!printQueue.isEmpty()) {
            String job = printQueue.poll(); // Retrieve and remove the job from the front of the queue
            System.out.println("Printing job: " + job);
            // Simulate the time it takes to print the job
            simulatePrinting();
        }
        System.out.println("All print jobs completed.");
    }

    // Simulate the time it takes to print a job
    private void simulatePrinting() {
        try {
            Thread.sleep(1000); // Simulate a 1-second print time per job
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Printing interrupted.");
        }
    }

    public static void main(String[] args) {
        PrinterQueue printerQueue = new PrinterQueue();

        // Add print jobs to the queue
        printerQueue.addPrintJob("Document1.pdf");
        printerQueue.addPrintJob("Image2.png");
        printerQueue.addPrintJob("Report3.docx");

        // Process and print the jobs in the queue
        printerQueue.processPrintJobs();
    }
}
