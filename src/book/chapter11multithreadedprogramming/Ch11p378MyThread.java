package book.chapter11multithreadedprogramming;

// Improved MyThread
class Ch11p378MyThread implements Runnable {
    Thread thrd;

    // Construct a new thread
    Ch11p378MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // start the thread once it's created
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " terminating");
    }
}
