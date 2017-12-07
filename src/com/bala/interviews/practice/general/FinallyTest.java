package com.bala.interviews.practice.general;

/**
 * Whenever a return is present in the finally block along with other blocks
 * like try and catch only the return of the finally will be executed
 * 
 * @author bala
 *
 */
public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest et = new FinallyTest();
        System.out.println(et.result());
    }

    public int result() {
        int i = 0;
        try {
            i = 3 / 0;
            return 3;
        } catch (Exception e) {
            i = 5;
            return i;
        } finally {
            i = 7;
            return i;
        }
    }
}
