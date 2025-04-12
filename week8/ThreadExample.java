package week8;

class MyThread extends Thread { 
     
    // Override the run method to define the task to be executed by the thread 
    @Override     public void run() { 
        // Code to be executed by the thread         
        for (int i = 1; i <= 5; i++) {             
            try { 
                Thread.sleep(1000); // Make the thread sleep for 1 second (1000 milliseconds) 
                System.out.println("Thread is running: " + i); 
            } catch (InterruptedException e) { 
                System.out.println("Thread interrupted: " + e); 
            } 
        } 
    } 
} 
 
public class ThreadExample { 
     
    public static void main(String[] args) {         
        // Create an instance of MyThread 
        MyThread thread = new MyThread(); 
         
        // Start the thread 
        thread.start(); 
         
        // Print a message in the main thread while MyThread runs        
        for (int i = 1; i <= 5; i++) {             
            try { 
                Thread.sleep(500); // Main thread sleeps for 500 milliseconds 
                System.out.println("Main thread: " + i); 
            } catch (InterruptedException e) { 
                System.out.println("Main thread interrupted: " + e); 
            } 
        } 
    } 
} 
