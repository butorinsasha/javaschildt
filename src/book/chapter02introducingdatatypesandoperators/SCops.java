package book.chapter02introducingdatatypesandoperators;

public class SCops {

    static int reminder(int n, int d) {
        int r = n % d;
        System.out.println(n);
        return r;
    }

    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
//        if (d != 0 && (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);
        if (d != 0 && reminder(n, d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // now, set d to zero
        //Since d is zero, the second operand is not evaluated.
        if (d != 0 && reminder(n, d) == 0)
            System.out.println(d + " is a factor of " + n);

//        if (d != 0 & (n % d) == 0) // Exception in thread "main" java.lang.ArithmeticException: / by zero
//            System.out.println(d + " is a factor of " + n);
    }
}
