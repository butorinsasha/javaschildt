package book.chapter12enums_autoboxing_staticimport_annotations;

public class Ch12p418EnumDemo4 {
    public static void main(String[] args) {
        Ch12p411Transport tp, tp2, tp3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all Transport constants" +
                " and their ordinal values: ");
        for(Ch12p411Transport t : Ch12p411Transport.values()) {
            System.out.println(t + " " + t.ordinal()); // Obtain ordinal values
        }

        tp = Ch12p411Transport.AIRPLANE;
        tp2 = Ch12p411Transport.TRAIN;
        tp3 = Ch12p411Transport.AIRPLANE;

        System.out.println();

        // Demonstrate compareTo()

        if (tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes before " + tp2);

        if(tp.compareTo(tp2) > 0)
            System.out.println(tp + " comes before " + tp);

        if (tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}
