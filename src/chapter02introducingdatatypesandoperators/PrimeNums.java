package chapter02introducingdatatypesandoperators;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {
    public static void main(String[] args) {

//        List<Integer> primes = new ArrayList<Integer>();
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(n + ", ");
            }
        }
    }
}
