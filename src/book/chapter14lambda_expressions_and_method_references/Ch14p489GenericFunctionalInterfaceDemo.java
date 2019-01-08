package book.chapter14lambda_expressions_and_method_references;

public class Ch14p489GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        Ch14p489SomeTest<Integer> isFactor = (n, m) -> (n % m) == 0;

        if(isFactor.test(10,2))
            System.out.println("2 is factor of 10");



        System.out.println();



        Ch14p489SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "face"))
            System.out.println("'face' is found");
        else
            System.out.println("'face' not found");
    }
}
