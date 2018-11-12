package book.chapter04introducingclassesobjectsandmethods;

public class EuclideanDivision {

//    public static int quotion(int a, int b) {
//      int q = (int) Math.signum(b) * Math.floorDiv(a, Math.abs(b));
//      return q;
//    }
//
//    public static int remainder(int a, int b) {
//        int r = a - Math.abs(b) * Math.floorDiv(a, Math.abs(b));
//        return r;
//    }

    public static int quotion(int a, int b) {
        int q;
        if (b > 0) q = (int) Math.floor( (float) a / (float) b);
        else if (b < 0) q = (int) Math.ceil( (float) a / (float) b);
        else throw new ArithmeticException("Division by zero");
        return q;
    }

    public static int remainder(int a, int b) {
        int r;

        r = a - b * quotion(a,b);

        return r;
    }
}
