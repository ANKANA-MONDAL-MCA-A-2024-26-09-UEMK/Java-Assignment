package week8;

class MyThread extends Thread { 
     
    // Override the run method to define the task to be executed by the thread 
    @Override     
    public void run() { 
        // Print thread name and its iteration count         
        for (int i = 1; i <= 5; i++) { 
            // Yielding the thread after every 2 iterations             
            if (i == 3) { 
                System.out.println(Thread.currentThread().getName() + " is yielding."); 
                Thread.yield(); // Yielding the current thread 
            } 
            System.out.println(Thread.currentThread().getName() + " is running: " + i);             
            try { 
                Thread.sleep(500); // Simulate some work 
            } catch (InterruptedException e) { 
                System.out.println(e); 
            } 
        } 
    } 
} 
 
public class YieldMethodExample { 
     
    public static void main(String[] args) { 
        // Creating two threads 
        MyThread thread1 = new MyThread(); 
        MyThread thread2 = new MyThread(); 
         
        // Start both threads         
        thread1.start();         
        thread2.start(); 
    } 
} 

