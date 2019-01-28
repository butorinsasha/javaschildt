package book.chapter11multithreadedprogramming;

public class Ch11p375UseThreads {
    public static void main(String[] args) {
        System.out.println("main thread starting");

        // First cunstruct a Mythread object
        Ch11p375MyThread mt = new Ch11p375MyThread("thrd1");

        // Now, construct a thread from that object.
        Thread newThrd = new Thread(mt);

        //Finally start exectution of the thread
        newThrd.start();

        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("main thread interrupted");
            }
        }
        System.out.println("main thread ending");
    }
}
