package com.company;

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < 100; i++){
            num[i] = (int) (Math.random() * 100);
        }
        long count = IntStream.of(num).filter(x -> x % 2 == 0).count();
        System.out.println(count);
    }
}
