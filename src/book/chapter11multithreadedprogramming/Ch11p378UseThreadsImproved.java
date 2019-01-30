package book.chapter11multithreadedprogramming;

public class Ch11p378UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");
        Ch11p378MyThread mt = new Ch11p378MyThread("Child#1");

        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    }
}
