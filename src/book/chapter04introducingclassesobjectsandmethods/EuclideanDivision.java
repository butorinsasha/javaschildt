package book.chapter04introducingclassesobjectsandmethods;

public class EuclideanDivision {

    public static int quotion(int a, int b) {
      int q = (int) Math.signum(b) * Math.floorDiv(a, Math.abs(b));
      return q;
    }

    public static int remainder(int a, int b) {
        int r = a - Math.abs(b) * Math.floorDiv(a, Math.abs(b));
        return r;
    }
}
