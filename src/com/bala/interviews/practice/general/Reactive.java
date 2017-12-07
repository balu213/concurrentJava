package com.bala.interviews.practice.general;

import java.util.Arrays;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;

public class Reactive {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five"); // (1)
        Observable<String> observable = Observable.from(list); // (2)
        observable.subscribe(new Action1<String>() { // (3)
            @Override
            public void call(String element) {
                System.out.println(element); // Prints the element (4)
            }
        });
    }
}
