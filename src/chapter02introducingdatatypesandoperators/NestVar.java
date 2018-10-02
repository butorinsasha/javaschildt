package chapter02introducingdatatypesandoperators;

public class NestVar {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count = count + 1) {
            System.out.println("This is count: " + count);
//            int count;
//            for (int count = 0; count < 2; count++) {
//                System.out.println("This program is in error!");
//            }
        }
    }
}
