package week8;

class MyThread extends Thread { 
    @Override     
    public void run() { 
        // Get the name of the current thread and print it 
        System.out.println("The name of the current thread is: " + Thread.currentThread().getName()); 
    } 
} 
 
public class ThreadNameExample {     
    public static void main(String[] args) {         
        // Create a thread and set a custom name         
    MyThread thread1 = new MyThread();         
    thread1.setName("CustomThread-1"); 
 
        // Start the thread 
        thread1.start(); 
 
        // Main thread's name 
        System.out.println("The name of the main thread is: " + Thread.currentThread().getName()); 
 
        // Create another thread without setting a custom name         
        MyThread thread2 = new MyThread();         
        thread2.start(); 
 
        // Wait for the threads to finish 
        try {             
            thread1.join();             
            thread2.join(); 
        } catch (InterruptedException e) { 
            System.out.println("Main thread interrupted."); 
        } 
    } 
} 

