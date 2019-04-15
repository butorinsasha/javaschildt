package book.chapter11multithreadedprogramming;

class Ch11p388PriorityDemo {

    public static void main(String[] args) {

        Ch11p387Priority highPriority = new Ch11p387Priority("High priority");
        Ch11p387Priority lowPriority = new Ch11p387Priority("Low priority");

        // Set priorities
        highPriority.thrd.setPriority(Thread.NORM_PRIORITY + 4);
        lowPriority.thrd.setPriority(Thread.NORM_PRIORITY - 4);

        // Start the treads
        highPriority.thrd.start();
        lowPriority.thrd.start();

        try {
            highPriority.thrd.join();
            lowPriority.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\n"
                + "High priority thread counted to "
                + highPriority.count
        );

        System.out.println("\n"
                + "Low priority thread counted to "
                + lowPriority.count
        );

    }
}
