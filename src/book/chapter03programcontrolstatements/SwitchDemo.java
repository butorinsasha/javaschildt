package book.chapter03programcontrolstatements;

public class SwitchDemo {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            switch (x) {
                case 1:
                    System.out.println("x is one");
                    break;
                case 2:
                    System.out.println("x is two");
                    break;
                case 3:
                    System.out.println("x is three");
                    break;
                case 4:
                    System.out.println("x is four");
                    break; // 'break' here is necessary
                default:
                    System.out.println("x is not between one and four");
//                    break; // 'break;' here is unnecessary
            }
        }
    }
}
