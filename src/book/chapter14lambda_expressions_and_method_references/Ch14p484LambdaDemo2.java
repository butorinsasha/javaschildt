package book.chapter14lambda_expressions_and_method_references;

public class Ch14p484LambdaDemo2 {
    public static void main(String[] args) {
        Ch14p484NumericTest isFactor = (n, m) -> (n % m) == 0;
        if (isFactor.test(10,2))
            System.out.println("2 is a factor of 10");
        if (!isFactor.test(10,3))
            System.out.println("3 is not a factor of 10");
        System.out.println();

        Ch14p484NumericTest lessThan = (int n, int m) -> (n < m);
        if (lessThan.test(2, 10))
            System.out.println("2 is less than 10");
        if (!lessThan.test(10, 2))
            System.out.println("10 is not less than 2");
        System.out.println();

        Ch14p484NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == Math.abs(m);
        if (absEqual.test(4, -4))
            System.out.println("Absolute values of 4 and -4 are equal");
        if (absEqual.test(3, 3))
            System.out.println("Absolute values of 3 and 3 are equal");
        if (!absEqual.test(3, -4))
            System.out.println("Absolute values of 3 and -4 are not equal");
    }
}
