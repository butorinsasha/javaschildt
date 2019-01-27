package book.chapter11multithreadedprogramming.runnableinterface;


// Create a thread by implementing Runnable
class MyThread implements Runnable {
    String thrdName;

    // Constructor
    MyThread(String name) {
        this.thrdName = name;
    }

    // Entry point of thread
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thrdName + ":, count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println((thrdName + " interrupted."));
        }
    }
}