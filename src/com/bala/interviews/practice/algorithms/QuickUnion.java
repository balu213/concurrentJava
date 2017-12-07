package com.bala.interviews.practice.algorithms;

import java.util.Scanner;

public class QuickUnion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        QuickUnion uf = new QuickUnion(num);
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

    public QuickUnion(int num) {
        id = new int[num];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i])
            i = id[i];
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = id[p];
        int j = id[q];
        id[i] = j;
    }
}
