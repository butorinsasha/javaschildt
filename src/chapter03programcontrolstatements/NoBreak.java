package chapter03programcontrolstatements;

public class NoBreak {
    public static void main(String[] args) {
        int x;

        for (x = 0; x <= 5; x++) {
            switch (x) {
                case 0:
                    System.out.println("x is less than one");
                case 1:
                    System.out.println("x is less than two");
                case 2:
                    System.out.println("x is less than three");
                case 3:
                    System.out.println("x is less than four");
                case 4:
                    System.out.println("x is less than five");
                default:
                    System.out.println("x is less than or equal to five for sure");
            }
            System.out.println();
        }
    }
}
