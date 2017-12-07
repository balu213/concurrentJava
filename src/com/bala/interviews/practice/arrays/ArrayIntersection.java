package com.bala.interviews.practice.arrays;

import java.util.Arrays;

public class ArrayIntersection {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = { 1, 4, 5, 23, 45, 67 };
        int[] b;
        b = a.clone();
        a[0] = 5;
        System.out.println(Arrays.toString(a));
    }
}
