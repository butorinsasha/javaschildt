package book.chapter11multithreadedprogramming;

public class Ch11p382MoreThreads {

    public static void main(String[] args) {
        System.out.println("Main thread starting");

        Ch11p381MyThread mt1 = new Ch11p381MyThread("Child#1");
        Ch11p381MyThread mt2 = new Ch11p381MyThread("Child#2");
        Ch11p381MyThread mt3 = new Ch11p381MyThread("Child#3");

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
