package book.chapter14lambda_expressions_and_method_references;

public class Ch14p483LambdaDemo {
    public static class InnerClass {
        String str;
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        System.out.println("innerClass.getClass() = " + innerClass.getClass());

        Ch14p482MyValue myVal;

        myVal = () -> 98.6;

        //Same as

        myVal = new Ch14p482MyValue() {
            @Override
            public double getValue() {
                return 98.6;
            }
        };

        System.out.println("myVal.getValue() = " + myVal.getValue());
        System.out.println("myval.getClass = " + myVal.getClass());

        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/

        Ch14p482MyParamValue myPval;

        myPval = (n) -> 1.0 / n;

        // Same as

        myPval = new Ch14p482MyParamValue() {
            @Override
            public double getValue(double n) {
                return 1.0 / n;
            }
        };

        System.out.println("myPval.getValue(4) = " + myPval.getValue(4));
        System.out.println("myPval.getClass = " + myPval.getClass());

        //\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/

        // myVal = () -> "three"; //Error:(40, 23) java: incompatible types: bad return type in lambda expressionjava.lang.String cannot be converted to double
    }
}
