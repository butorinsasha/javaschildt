package book.chapter11multithreadedprogramming;

import java.sql.SQLOutput;

public class JoinTreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");

        Ch11p381MyThread mt1 = new Ch11p381MyThread("Child#1");
        Ch11p381MyThread mt2 = new Ch11p381MyThread("Child#2");
        Ch11p381MyThread mt3 = new Ch11p381MyThread("Child#3");


        //Wait until the specified thread ends
        //mt2.thrd.join();
        try {
            mt1.thrd.join();
            System.out.println("Child#1 joined.");
            mt2.thrd.join();
            System.out.println("Child#2 joined.");
            mt3.thrd.join();
            System.out.println("Child#3 joined.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread ending");
    }
}
