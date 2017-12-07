package com.bala.interviews.practice.arrays;

import java.util.Scanner;

/**
 * This is a program given in Hacker Rank. This is for the sum of numbers in an
 * array.
 * 
 * @author bala
 *
 */

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            count += arr[arr_i];
        }
        System.out.println(count);
    }

}
