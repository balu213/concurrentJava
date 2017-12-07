package com.bala.interviews.practice.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author bala
 *
 */
public class QuickFindUF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        QuickFindUF uf = new QuickFindUF(num);
        while (num > 0) {
            int p = input.nextInt();
            int q = input.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }

    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
        System.out.println(Arrays.toString(id));
    }
}
