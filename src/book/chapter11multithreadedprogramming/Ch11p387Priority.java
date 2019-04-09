package book.chapter11multithreadedprogramming;

public class Ch11p387Priority implements Runnable{

    int count;
    Thread thrd;
    static boolean stop = false;    // the point it's static which means it's common for all treads
    static String currentName;      // the point it's static which means it's common for all treads

    public Ch11p387Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if(currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;

        System.out.println("\n"
                + thrd.getName()
                + " terminating"
        );
    }
}
