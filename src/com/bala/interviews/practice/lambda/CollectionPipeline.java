package com.bala.interviews.practice.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionPipeline {

    public static int transform(int num) {
        System.out.println("Thread"+ Thread.currentThread());
        return num * 2;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .parallel()
                .map(CollectionPipeline::transform)
                .forEachOrdered(System.out::println);
    }
}
