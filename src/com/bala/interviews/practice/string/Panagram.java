package com.bala.interviews.practice.string;

import java.util.ArrayList;
import java.util.Collections;

public class Panagram {
    public static void main(String[] args) {
        System.out.println(findFactors(10).get(2));
        System.out.println(findFactors(10).size());
        // System.out.println(findFactors(10).size() <= 5 ?
        // findFactors(10).get(5) : 0);
    }

    public static ArrayList<Integer> findFactors(int num) {
        ArrayList<Integer> factors = new ArrayList<>();

        // Skip two if the number is odd
        int incrementer = num % 2 == 0 ? 1 : 2;

        for (int i = 1; i <= Math.sqrt(num); i += incrementer) {

            // If there is no remainder, then the number is a factor.
            if (num % i == 0) {
                factors.add(i);

                // Skip duplicates
                if (i != num / i) {
                    factors.add(num / i);
                }

            }
        }

        // Sort the list of factors
        Collections.sort(factors);

        return factors;
    }

    static ArrayList<Long> allFactors(long n) {
        ArrayList<Long> factors = new ArrayList<>();

        int inc = n % 2 == 0 ? 1 : 2;
        for (long i = 1; i <= Math.sqrt(n); i += inc) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        Collections.sort(factors);
        return factors;
    }
}
