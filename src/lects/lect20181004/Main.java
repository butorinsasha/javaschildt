package lects.lect20181004;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(7, "hello");
        Pair<Double, Pair<Integer,String>> p2 = new Pair<>(9.2, new Pair<Integer, String>(7, "hello"));
    }
}
