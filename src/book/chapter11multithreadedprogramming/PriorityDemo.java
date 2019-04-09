package book.chapter11multithreadedprogramming

import lects.lect20181004.Main

object PriorityDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val highPriority = Ch11p387Priority("High priority")
        val lowPriority = Ch11p387Priority("Low priority")

        // Set priorities
        highPriority.thrd.priority = Thread.NORM_PRIORITY + 5
        lowPriority.thrd.priority = Thread.NORM_PRIORITY - 4

        // Start the treads
        highPriority.thrd.start()
        lowPriority.thrd.start()

        try {
            highPriority.thrd.join()
            lowPriority.thrd.join()
        } catch (e: InterruptedException) {
            println("Main thread interrupted.")
        }

        println("\n" +
                "High priority thread counted to " +
                highPriority.count
        )
        println("\n" +
                "Low priority thread counted to " +
                lowPriority.count
        )

    }
}
