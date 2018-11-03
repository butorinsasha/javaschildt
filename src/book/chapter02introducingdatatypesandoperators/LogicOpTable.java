package book.chapter02introducingdatatypesandoperators;

public class LogicOpTable {

    static int bo01ean(boolean b) {
        if (b) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p) + "\t");

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p) + "\t");

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p) + "\t");

        p = false;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p) + "\t");

        System.out.print("\n\n");

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        System.out.print(bo01ean(p) + "\t" + bo01ean(q) + "\t");
        System.out.print(bo01ean(p & q) + "\t" + bo01ean(p | q) + "\t");
        System.out.println(bo01ean(p ^ q) + "\t" + bo01ean(!p) + "\t");

        p = true;
        q = false;
        System.out.print(bo01ean(p) + "\t" + bo01ean(q) + "\t");
        System.out.print(bo01ean(p & q) + "\t" + bo01ean(p | q) + "\t");
        System.out.println(bo01ean(p ^ q) + "\t" + bo01ean(!p) + "\t");

        p = false;
        q = true;
        System.out.print(bo01ean(p) + "\t" + bo01ean(q) + "\t");
        System.out.print(bo01ean(p & q) + "\t" + bo01ean(p | q) + "\t");
        System.out.println(bo01ean(p ^ q) + "\t" + bo01ean(!p) + "\t");

        p = false;
        q = false;
        System.out.print(bo01ean(p) + "\t" + bo01ean(q) + "\t");
        System.out.print(bo01ean(p & q) + "\t" + bo01ean(p | q) + "\t");
        System.out.println(bo01ean(p ^ q) + "\t" + bo01ean(!p) + "\t");

    }
}
