package com.bala.interviews.practice.arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 6, 8, 5 };
        int temp = 0;
        int num = a.length;
        for (int i = 0; i < num / 2; i++) {
            temp = a[i];
            a[i] = a[num - 1];
            a[num - 1] = temp;
            num--;
        }
        System.out.println(toString(a));
    }

    public static String toString(int[] a) {
        int num = a.length;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0;; i++) {
            sb.append(a[i]);
            if (i == num - 1)
                return sb.append("]").toString();
            sb.append(",");
        }
    }

}
