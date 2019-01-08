package book.chapter14lambda_expressions_and_method_references;

public class Ch14p486LmbdaDemo3 {
    public static void main(String[] args) {
        Ch14p486StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        String str = "This is a test";
        System.out.println("Testing string: " + str);
        if (isIn.test(str, "is a"))
            System.out.println("'is a' found");
        else
            System.out.println("'is a' not found");

        if (isIn.test(str, "xyz"))
            System.out.println("'xyz' found");
        else
            System.out.println("'xyz' not found");
    }
}
