package com.bala.interviews.practice.arrays;

/**
 * This is a program for equilibrium index in an array.
 * 
 * @author bala
 *
 */

public class EquilibriumIndex {
    /**
     * This is main method.
     * 
     * @param args
     */
    public static void main(String[] args) {
        EquilibriumIndex ei = new EquilibriumIndex();
        int index = ei.quilibrium(new int[] { 1, -1, 2, -1, 0 }, 5);
        System.out.println(index);
    }

    public int quilibrium(int[] arr, int n) {
        if (n == 0) {
            return -1;
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long sum_left = 0;
        for (int i = 0; i < arr.length; i++) {
            long sum_right = sum - sum_left - arr[i];
            if (sum_right == sum_left) {
                return i;
            }
            sum_left += arr[i];
        }

        return 1;
    }
}
