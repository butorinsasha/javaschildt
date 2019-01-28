package book.chapter11multithreadedprogramming;

public class Ch11p380MyThread extends Thread {

    // Constructor
    Ch11p380MyThread(String name) {
        super(name);
        start();
    }

    // Begin execution of new thread
    public void run() {
        System.out.println(getName() + " starting");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println(getName() + ": count=" + i);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
        System.out.println(getName() + "terminating");
    }
}
