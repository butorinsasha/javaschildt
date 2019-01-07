package book.chapter12enums_autoboxing_staticimport_annotations;

public class Ch12p414EnumDemo2 {
    // Use the built-in enumeration methods.
    // An enumeration of Ch12p411Transport varieties.

    public static void main(String args[])
    {
        System.out.println("Here are all Ch12p411Transport constants");

        // use values()
        // Obtain an array of Ch12p411Transport constants.
        Ch12p411Transport[] allTransports = Ch12p411Transport.values();
        for(Ch12p411Transport t : allTransports)
            System.out.println(t);
        System.out.println();

        // use valueOf()
        // Obtain the constant with the name AIRPLANE.
        int i = Integer.valueOf("123");
        System.out.println(i);

        // Same for enums
        Ch12p411Transport tp = Ch12p411Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}

