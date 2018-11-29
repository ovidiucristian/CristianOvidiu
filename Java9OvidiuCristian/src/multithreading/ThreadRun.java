/*
 * Rulare thread-uri
 */
package multithreading;

/**
 *
 * @author Ovidiu
 */
public class ThreadRun extends Thread{

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
 Thread thw = new HelloWorldThread();
 thw.setPriority(MAX_PRIORITY);
 System.out.println("Prioritatea thread-ului este: " + thw.getPriority());
thw.start();

 Thread tha = new HelloAllThread();
 tha.setPriority(MIN_PRIORITY);
 System.out.println("Prioritatea thread-ului este: " + tha.getPriority());
tha.start();
 }
 }
     

    
    

