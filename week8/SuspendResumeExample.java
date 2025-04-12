package week8;

class MyThread extends Thread { 
    private boolean suspended = false; 
 
    // Run method simulating work with suspend and resume behavior 
    @Override     public void run() { 
        for (int i = 1; i <= 5; i++) { 
            // If suspended, wait until it's resumed             
            while (suspended) { 
                try { 
                    synchronized (this) { 
                        wait(); // Wait until notified (when resumed) 
                    } 
                } catch (InterruptedException e) { 
                    System.out.println("Thread interrupted: " + e); 
                } 
            } 
 
            System.out.println(Thread.currentThread().getName() + " is running: " + i);             
            try { 
                Thread.sleep(500); // Simulate work by sleeping 
            } catch (InterruptedException e) { 
                System.out.println("Thread interrupted: " + e); 
            } 
        } 
    } 
 
    // Method to suspend the thread     
    public synchronized void suspendThread() { 
        suspended = true; 
    } 
 
    // Method to resume the thread     
    public synchronized void resumeThread() { 
        suspended = false;         
        synchronized (this) { 
            notify(); // Notify the thread to resume 
        } 
    } 
} 
 
public class SuspendResumeExample { 
    public static void main(String[] args) {         
        // Create and start the thread         
        MyThread thread1 = new MyThread();         
        thread1.start(); 
 
        // Suspend the thread after a short delay         
        try { 
            Thread.sleep(2000);  // Let the thread run for 2 seconds             
            System.out.println("Suspending the thread...");             
            thread1.suspendThread(); 
 
            // Resume the thread after a short delay 
            Thread.sleep(2000);  // Wait for 2 seconds             
            System.out.println("Resuming the thread...");             
            thread1.resumeThread(); 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted: " + e); 
        } 
    } 
} 
