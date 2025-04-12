package week8;

class CounterThread extends Thread {     
    public static int count = 0; 
 
    // Method to update the counter for 10ms 
    @Override     
    public void run() {         
        for (int i = 0; i < 10; i++) { 
            synchronized (CounterThread.class) {                 
                count++;                 
                try { 
                    // Sleep for 10ms before updating the count again 
                    Thread.sleep(10); 
                } catch (InterruptedException e) { 
                    System.out.println(Thread.currentThread().getName() + " interrupted: " + e); 
                } 
            } 
        } 
        // Print the final value of count for this thread 
        System.out.println(Thread.currentThread().getName() + " final count: " + count); 
    } 
} 
 
public class ThreadPriorityExample {     
    public static void main(String[] args) { 
        // Create 4 threads with different priorities 
        CounterThread thread1 = new CounterThread(); 
        CounterThread thread2 = new CounterThread(); 
        CounterThread thread3 = new CounterThread(); 
        CounterThread thread4 = new CounterThread(); 
 
        // Set thread priorities (1, 3, 5, 7)         
        thread1.setPriority(1);         
        thread2.setPriority(3);         
        thread3.setPriority(5);         
        thread4.setPriority(7); 
 
        // Start the threads         
        thread1.start();         
        thread2.start();         
        thread3.start();         
        thread4.start(); 
 
        // Wait for all threads to finish         
        try { 
            thread1.join();             
            thread2.join();             
            thread3.join();             
            thread4.join(); 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted: " + e); 
        } 
 
        // Final output: print the count from each thread after all have finished         
        System.out.println("Final count value: " + CounterThread.count); 
    } 
} 

