package book.chapter12enums_autoboxing_staticimport_annotations;

public class Ch12p415EnumDemo3 {
    public static void main(String[] args) {
        Ch12p411Transport tp = Ch12p411Transport.AIRPLANE;

        //Dispaly speed of an airplane
        System.out.println(
                "Typical speed for an airplane is "
                + tp.getSpeed()
//                + Ch12p411Transport.AIRPLANE.getSpeed()
                + " miles per hour.\n");

        // Display all Transports and speeds
        System.out.println("All transport speeds: ");
        for (Ch12p411Transport t : Ch12p411Transport.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour");
        }
    }
}
