package week8;

class MyThread extends Thread { 
     
    // Override the run method to define the task to be executed by the thread 
    @Override     
    public void run() { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(Thread.currentThread().getName() + " is running: " + i);             
            try { 
                // Sleep for 1 second (1000 milliseconds) 
                Thread.sleep(1000);  // Sleep for 1000 milliseconds (1 second) 
            } catch (InterruptedException e) { 
                System.out.println("Thread interrupted: " + e); 
            } 
        } 
    } 
} 
 
public class SleepMethodExample { 
     
    public static void main(String[] args) { 
        // Creating two threads 
        MyThread thread1 = new MyThread(); 
        MyThread thread2 = new MyThread(); 
         
        // Start both threads 
        thread1.start(); 
        thread2.start(); 
    } 
} 

