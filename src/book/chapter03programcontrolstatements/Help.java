package book.chapter03programcontrolstatements;

public class Help {
    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println("    1. if:");
        System.out.println("\t2. switch:");
        System.out.print("Choose one: ");

        choice = (char) System.in.read();

        System.out.print('\n');

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2': {
                System.out.println("The switch:\n");
                System.out.println("switch (expression) /*of byte, short, int, char or String (since jdk7)*/ {");
                System.out.println("\tcase constant_1 /*of compatible type to type of the switch expression*/:");
                System.out.println("\t\tstatement sequence for first case");
                System.out.println("\t\tbreak;");
                System.out.println("\tcase constant_2 /*of compatible type to type of the switch expression*/:");
                System.out.println("\t\t{statement sequence for second case}");
                System.out.println("\t\tbreak;");
                System.out.println("\t\t...");
                System.out.println("\tdefault: /*optional*/");
                System.out.println("\t\tstatement sequence for default case");
                System.out.println("\t\tbreak; /*unnecessary break here*/;");
                break;
            }
            default:
                System.out.println("Selection is not found");
        }

    }
}
