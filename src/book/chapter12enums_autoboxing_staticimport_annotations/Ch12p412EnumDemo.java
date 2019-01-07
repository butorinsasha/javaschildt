package book.chapter12enums_autoboxing_staticimport_annotations;

public class Ch12p412EnumDemo {
    public static void main(String[] args) {
        Ch12p411Transport tp = Ch12p411Transport.AIRPLANE;

        // Output an enum value
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Ch12p411Transport.TRAIN;

        // Compare two enums values
        if (tp == Ch12p411Transport.TRAIN)
            System.out.println("tp contains TRAN.\n");

        // Use an enum to control a switch statement
        switch (tp) {
            case CAR:
                System.out.println("A car carries people");
                break;
            case TRUCK:
                System.out.println("A truck carries freight");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies.");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}
