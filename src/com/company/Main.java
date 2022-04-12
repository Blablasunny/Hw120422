package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        Comparator<Log> comparator = Comparator.comparing(l -> l.t);
        Random random = new Random();
        List<Log> logs = random.ints(3, 0, 3).mapToObj(i -> new Log(getT(i), getC(i % 3))).collect(Collectors.toList());
        logs.stream().sorted(comparator).forEach(System.out::println);
        logs.stream().filter(x -> x.c == Count.Count1).forEach((System.out::println));
    }
    public static Type getT(int i) {
        Type[] type = {Type.Type1, Type.Type2, Type.Type3};
        return type[i];
    }
    public static Count getC(int i) {
        Count[] count = {Count.Count1, Count.Count2, Count.Count3};
        return count[i];
    }
}
