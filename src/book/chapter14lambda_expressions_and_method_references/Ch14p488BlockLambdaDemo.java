package book.chapter14lambda_expressions_and_method_references;

public class Ch14p488BlockLambdaDemo {
    public static void main(String[] args) {
        
        // Block lambda returns the smallest positive factor of a value
        Ch14p488NumericFunc smallestF = (n) -> {
            int result = 1;

            //Get absolute value of n
            n = n < 0 ? -n : n;
            for (int i = 2; i <= n/i; i++) {
            // Same as
            // for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };


        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
        System.out.println("Smallest factor of 9 is " + smallestF.func(9));
        System.out.println("Smallest factor of -9 is " + smallestF.func(-9));
        System.out.println("Smallest factor of 35 is " + smallestF.func(35));
        System.out.println("Smallest factor of 0 is " + smallestF.func(0));

        System.out.println();

        Ch14p488NumericProc sayHelloToConsoleNTimes = (n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(i + " Hello");

            }
        };

        sayHelloToConsoleNTimes.proc(10);
    }
}
