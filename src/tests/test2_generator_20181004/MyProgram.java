package tests.test2_generator_20181004;

public class MyProgram {
    public static void main(String[] args) {
//        System.out.println("version 3.0");
//        System.out.println(Integer.toBinaryString(Integer.parseInt(args[2])));
//        System.out.println(Generator.countBinOnes(Integer.parseInt(args[2]),Integer.parseInt(args[3])));

        Generator generate = new Generator(Integer.parseInt(args[1]));
        System.out.print(args[1] + " ");
        for (int i = 1; i <= ( Integer.parseInt(args[0]) - 1 ); i++) {
            System.out.print(generate.getNext() + " ");
        }
        System.out.println();
    }
}
