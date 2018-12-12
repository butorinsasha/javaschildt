package book.chapter04introducingclassesobjectsandmethods;

class Ch04p124HelpClassDemo {
    public static void main(String args[])
            throws java.io.IOException {
        char choice, ignore;
        Ch04p122Help hlpobj = new Ch04p122Help();

        for(;;) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');

            } while( !hlpobj.isValid(choice) );

            if(choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn(choice);
        }
    }
}
