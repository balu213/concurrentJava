package com.bala.interviews.practice.string;

/**
 * This is a simple program to reverse the String in place. It can be reversed
 * using two arrays as well.
 * 
 * @author bala
 *
 */
public class StringReverse {

    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        String reverse = sr.reverse("capsdfksdjfbd");
        System.out.println(reverse);
    }

    public String reverse(String input) {
        char[] c = input.toCharArray();
        char temp;
        int num = c.length - 1;
        for (int i = 0; i < c.length / 2; i++) {
            temp = c[i];
            c[i] = c[num];
            c[num] = temp;
            num--;
        }
        return new String(c);
    }
}
