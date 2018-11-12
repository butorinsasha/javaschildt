package book.chapter04introducingclassesobjectsandmethods;

public class Ch04p130Finalize {
    public static void main(String[] args) {
        int count;

        Ch04p130FDemo obj = new Ch04p130FDemo (0);
        /*Now, generate a large number of objects.
        At some point, garbage collection will occur.
        Note: you might need to increase the number of objects generated in order to force garbage collection.*/

        for (count = 1; count <= 58400; count++) {
            obj.generator(count);
        }
    }
}
