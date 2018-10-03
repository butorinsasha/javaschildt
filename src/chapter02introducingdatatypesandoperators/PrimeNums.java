package chapter02introducingdatatypesandoperators;

import java.util.ArrayList;
import java.util.List;

public class PrimeNums {

    static int steps;

    static boolean boolCheckStep(boolean b) {
        steps++;
        if (b) {
            return true;
        } else {
            return false;
        }
//        System.out.println(steps);
    }

    public static void main(String[] args) {
        steps = 0;
        List<Integer> primes = new ArrayList<>();
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
//            for (int i = 2; i <= n; i++) {
//            for (int i = 2; i <= n/2; i++) {
//            for (int i = 2; i <= Math.sqrt(n); i++) {
//            for (int i = 2; i <= n/i; i++) {
            for (Integer i : primes) {
                if ( (i <= n/i) && boolCheckStep((n % i) == 0) ) {
//                if ( boolCheckStep((n % i) == 0) ) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(n);
//                System.out.print(n + ", ");
            }
        }
        System.out.println();
        System.out.println("calculated for " + steps + " steps");
//        System.out.println(primes);
    }
}
