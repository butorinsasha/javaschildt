package book.chapter14lambda_expressions_and_method_references;

// The functional interface is an interface with one and only one abstract method
public interface Ch14p482MyValue {
    double getValue();

    default void getValue1() { }

    static void getValue2() { }
}
