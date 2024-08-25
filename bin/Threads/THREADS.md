

## Concurrency vs. Parallelism in Java

**Concurrency** and **Parallelism** are key concepts in Java programming, particularly in multithreaded applications. Though often used interchangeably, they have distinct meanings:

### Concurrency
- **Definition**: Concurrency is the ability of a system to manage multiple tasks simultaneously by interleaving them. In Java, this is achieved by creating multiple threads within a single process.
- **How it Works**: In a concurrent system, multiple threads can make progress within the same time slice but not necessarily at the exact same moment. The operating system or JVM switches between threads, creating the illusion of simultaneous execution.
- **Use Case**: Ideal for tasks that are independent and can overlap, such as handling I/O operations while performing computations.
- **Example**: Running multiple I/O-bound tasks concurrently within the same application.

```java
// Example of a concurrent task
ExecutorService executorService = Executors.newFixedThreadPool(10);

for (int i = 0; i < 10; i++) {
    executorService.submit(() -> {
        // Simulate some work
        System.out.println("Task running by: " + Thread.currentThread().getName());
    });
}

executorService.shutdown();
```

### Parallelism
- **Definition**: Parallelism involves executing multiple tasks at the same time on different processing cores. It's a form of concurrency where tasks truly run simultaneously.
- **How it Works**: Tasks are split into smaller sub-tasks that can be processed simultaneously by multiple processors or cores. Java supports parallelism through frameworks like Fork/Join or parallel streams.
- **Use Case**: Best for CPU-bound tasks that can be divided into smaller units of work and executed in parallel.
- **Example**: Processing a large dataset by dividing it into chunks and processing each chunk in parallel.

```java
// Example of parallelism using Fork/Join framework
ForkJoinPool forkJoinPool = new ForkJoinPool();

RecursiveTask<Integer> task = new RecursiveTask<>() {
    @Override
    protected Integer compute() {
        // Simulate some work by splitting a task
        if (workIsSmallEnough()) {
            return processDirectly();
        } else {
            RecursiveTask<Integer> subTask1 = ...;
            RecursiveTask<Integer> subTask2 = ...;
            invokeAll(subTask1, subTask2);
            return subTask1.join() + subTask2.join();
        }
    }
};

forkJoinPool.invoke(task);
```

### Summary

- **Concurrency**: Managing multiple tasks at once by interleaving them.
- **Parallelism**: Executing multiple tasks simultaneously on multiple cores.

Understanding the difference between concurrency and parallelism helps in choosing the right approach for designing multithreaded applications in Java. Concurrency is about managing multiple tasks, while parallelism maximizes the use of multiple processors.



## CREATING THREADS

There are two ways to create our own Thread object:

- **Subclassing the Thread class**
- **Implementing the Runnable interface**

In both cases, the `run()` method should be implemented.

### Subclassing the Thread Class
When you subclass the `Thread` class, you create a new class that extends `Thread`, and you override the `run()` method to define the code that should be executed by the thread.

#### Example:

```java
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();  // Start the thread, which will execute the run() method

        MyThread thread2 = new MyThread();
        thread2.start();  // Another thread running the same run() method
    }
}
```

### Implementing the Runnable Interface
The `Runnable` interface is a functional interface that has a single method, `run()`, that needs to be implemented. This approach is more flexible as it allows the class to extend another class while still being able to be executed as a thread.

#### Example:

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();  // Start the thread, which will execute the run() method in MyRunnable

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();  // Another thread running the same run() method
    }
}
```

### Choosing Between Subclassing and Implementing
- **Subclassing Thread**: Use when you want to create a specialized thread with additional methods or when the class already extends `Thread`.
- **Implementing Runnable**: Preferred when you need to implement threading in a class that already extends another class or when you want to separate the task from the thread management.

### Summary

Both methods allow you to create and execute a thread, but implementing `Runnable` is often favored due to its flexibility and alignment with the principle of composition over inheritance.



## THREAD LIFECYCLE

A thread in Java goes through various stages during its execution. Understanding these stages is crucial for effective thread management and debugging. The stages of a thread's lifecycle are:

- **New**
- **Runnable**
- **Running**
- **Blocked (Non-runnable state)**
- **Dead**

### 1. New
- **Definition**: A thread is in the "New" state when it is created but has not yet started. At this point, the thread object is instantiated, but the `start()` method has not been called.
- **Characteristics**: 
  - The thread is not yet scheduled for execution.
  - No resources are allocated to the thread.
- **Example**:

```java
Thread thread = new Thread(() -> System.out.println("Thread is running."));
// Thread is in the New state
```

### 2. Runnable
- **Definition**: Once the `start()` method is called, the thread moves to the "Runnable" state. In this state, the thread is ready to run and is waiting for the CPU to schedule its execution.
- **Characteristics**:
  - The thread is in the queue for execution but may not be running immediately.
  - The operating system's thread scheduler determines when the thread gets CPU time.
- **Example**:

```java
thread.start(); // Thread is now in the Runnable state
```

### 3. Running
- **Definition**: A thread enters the "Running" state when the CPU starts executing its code. The thread is actively running in this state.
- **Characteristics**:
  - The thread is executing the code inside the `run()` method.
  - The thread remains in the running state until it is paused, blocked, or finished.
- **Example**:

```java
// When the thread is actually being executed by the CPU, it is in the Running state
```

### 4. Blocked (Non-runnable state)
- **Definition**: A thread enters the "Blocked" state when it is temporarily inactive. This can happen for several reasons, such as waiting for a resource to become available or waiting for I/O operations to complete.
- **Types of Blocked States**:
  - **Waiting**: The thread is waiting indefinitely for another thread to perform a particular action (e.g., waiting for a lock or a signal).
  - **Timed Waiting**: The thread is waiting for another thread to perform an action for a specified period (e.g., `Thread.sleep(milliseconds)`).
  - **Blocked on I/O**: The thread is waiting for an I/O operation to complete.
  - **Blocked on Synchronized Resource**: The thread is waiting to acquire a lock on a synchronized block or method.
- **Example**:

```java
// The thread can enter a blocked state if it's waiting for I/O or a synchronized lock
synchronized (this) {
    // code that requires lock
}
```

### 5. Dead
- **Definition**: A thread enters the "Dead" state when its execution is complete, either because the `run()` method has finished or an uncaught exception terminates the thread.
- **Characteristics**:
  - The thread cannot be restarted.
  - All resources associated with the thread are released.
- **Example**:

```java
// When the run() method completes, the thread moves to the Dead state
```

### Summary

- **New**: Thread is created but not started.
- **Runnable**: Thread is ready to run, waiting for CPU time.
- **Running**: Thread is actively executing.
- **Blocked**: Thread is temporarily inactive, waiting for a resource or event.
- **Dead**: Thread has completed execution and cannot be restarted.

