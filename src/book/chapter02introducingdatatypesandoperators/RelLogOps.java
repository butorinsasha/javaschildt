package book.chapter02introducingdatatypesandoperators;

import java.sql.SQLOutput;

public class RelLogOps {

    static int i, j; // will be assigned to default value for int, which is 0
    static boolean b1, b2; // will be assigned to default value for boolean, which is false

    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        System.out.println("i = " + RelLogOps.i);
        System.out.println("j = " + RelLogOps.j);
        System.out.println("b1 = " + RelLogOps.b1);
        System.out.println("b2 = " + RelLogOps.b2);

        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this wont't not executed");
        if(i >= j) System.out.println("this wont't not executed");
        if(i > j) System.out.println("this wont't not executed");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("this wont't execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}
