package book.chapter11multithreadedprogramming;

public class Ch11p381MyThread implements Runnable {

    Thread thrd;

    public Ch11p381MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println(thrd.getName() + ": count=" + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " terminating");
    }
}
