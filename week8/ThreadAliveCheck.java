package week8;

class MyThread extends Thread { 
    @Override     
    public void run() { 
        try { 
            // Simulate some work by making the thread sleep for 2000ms (2 seconds) 
            System.out.println(Thread.currentThread().getName() + " is starting."); 
            Thread.sleep(2000);  // Sleep for 2 seconds 
            System.out.println(Thread.currentThread().getName() + " has finished."); 
        } catch (InterruptedException e) { 
            System.out.println(Thread.currentThread().getName() + " was interrupted."); 
        } 
    } 
} 
 
public class ThreadAliveCheck {     
    public static void main(String[] args) {         
    MyThread thread1 = new MyThread(); 
    MyThread thread2 = new MyThread(); 
 
        // Start the threads         
        thread1.start();         
        thread2.start(); 
 
        // Check if the threads are alive at various points in time         
        try { 
            System.out.println("Checking if threads are alive after starting them:"); 
            System.out.println("Thread 1 alive: " + thread1.isAlive());             
            System.out.println("Thread 2 alive: " + thread2.isAlive()); 
 
            // Wait for threads to finish 
            thread1.join();             
            thread2.join(); 
 
            System.out.println("Checking if threads are alive after they finish:"); 
            System.out.println("Thread 1 alive: " + thread1.isAlive());             
            System.out.println("Thread 2 alive: " + thread2.isAlive()); 
 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted."); 
        } 
    } 
} 

