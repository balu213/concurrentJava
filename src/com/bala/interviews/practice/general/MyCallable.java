package com.bala.interviews.practice.general;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return 1;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future f = es.submit(new MyCallable());

        System.out.println(f.isDone());
        System.out.println(f.isCancelled());
        System.out.println(f.get());
    }

}
