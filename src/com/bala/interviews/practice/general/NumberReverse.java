package com.bala.interviews.practice.general;

import java.util.Scanner;

public class NumberReverse {

    public static void main(String[] args) {
        int n, reverse = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;

        }
        System.out.println(reverse);
    }
}
