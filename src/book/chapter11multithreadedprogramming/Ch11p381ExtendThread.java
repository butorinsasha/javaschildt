package book.chapter11multithreadedprogramming;

public class Ch11p381ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        Ch11p380MyThread mt = new Ch11p380MyThread("Child#1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("Main thread ending");
    }
}
