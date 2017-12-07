package com.bala.interviews.practice.algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 5, 3, 2, 78, 45, 23, 232, 24, 34 };
        Arrays.sort(a);
        System.out.println(binarySearch(a, 46));
    }

    public static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
