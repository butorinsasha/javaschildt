package book.chapter04introducingclassesobjectsandmethods;

public class Ch04p130FDemo {
    int x;
    Ch04p130FDemo(int i) {
        x =i;
    }

    // called when object is recycled
    protected void finalize() {
        System.out.println("finalize() " + x);
    }

    // generates an object that is immediately destroyed
    void generator(int i) {
        Ch04p130FDemo o = new Ch04p130FDemo(i);
    }
}
