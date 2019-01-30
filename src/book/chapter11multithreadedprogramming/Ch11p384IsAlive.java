package book.chapter11multithreadedprogramming;

//Use is Alive
public class Ch11p384IsAlive {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        Ch11p381MyThread mt1 = new Ch11p381MyThread("Child #1");
        Ch11p381MyThread mt2 = new Ch11p381MyThread("Child #2");
        Ch11p381MyThread mt3 = new Ch11p381MyThread("Child #3");
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() ||  // This waits until all threads terminate
                mt2.thrd.isAlive() ||
                mt3.thrd.isAlive());
        System.out.println("Main thread ending.");
    }
}
