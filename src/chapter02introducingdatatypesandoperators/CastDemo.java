package chapter02introducingdatatypesandoperators;

public class CastDemo {
    public static void main(String[] args) {

        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y);
        System.out.println("INteger outcome of (x / y): " + i);

        i = 100;
        b = (byte) i; // byte takes range of-128..127
        System.out.println("Value of b: " + b);

        i = 130;
        b = (byte) i;
        System.out.println("Value of b: " + b); // 128_[10] = 10000010_[2] =

        b = 88; // ASCII code for X
        ch = (char) b;
        System.out.println("ch: " + ch);

    }
}
