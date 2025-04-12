package week8;

class Counter {     
    private int count = 0; 
 
    // Synchronized method to increment the counter 
    public synchronized void increment() {         
        count++; 
        System.out.println(Thread.currentThread().getName() + " - Incremented: " + count); 
    } 
 
    // Method to get the current count (not synchronized in this case)     
    public int getCount() { 
        return count; 
    } 
} 
 
class CounterThread extends Thread {     
    private Counter counter; 
 
    // Constructor to pass the Counter object     
    public CounterThread(Counter counter) { 
        this.counter = counter; 
    } 
 
    @Override     
    public void run() { 
        // Each thread increments the counter 5 times 
        for (int i = 0; i < 5; i++) { 
            counter.increment(); 
            try { 
                Thread.sleep(100); // Sleep to simulate some delay 
            } catch (InterruptedException e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 
 
public class SynchronizationExample {     
    public static void main(String[] args) {         
        // Create a shared Counter object 
        Counter counter = new Counter(); 
 
        // Create and start 3 threads, all acting on the same Counter object 
        Thread t1 = new CounterThread(counter); 
        Thread t2 = new CounterThread(counter); 
        Thread t3 = new CounterThread(counter); 
 
        t1.start();         
        t2.start();         
        t3.start(); 
 
        // Wait for all threads to finish 
        try {             
            t1.join();             
            t2.join();             
            t3.join(); 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted: " + e); 
        } 
 
        // Print the final count value 
        System.out.println("Final count value: " + counter.getCount()); 
    } 
} 

