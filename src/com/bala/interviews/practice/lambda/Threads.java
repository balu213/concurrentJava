package com.bala.interviews.practice.lambda;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        final Thread separateThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("From the new thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        separateThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("From the main thread: " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }

        final Executor executor = Executors.newCachedThreadPool();
    }
}
