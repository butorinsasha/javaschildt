package chapter03programcontrolstatements;

public class Comma {
    public static void main(String[] args) {
        int i, j;
        for (j = 10, i = 0; i < j;  i++, j--) {
            System.out.println(" i and j: " + i + " " + j);
        }
    }
}
