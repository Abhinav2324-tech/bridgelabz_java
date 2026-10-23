package com.bridgelabz.java_streamapi;
import java.util.*;
import java.util.stream.*;

public class Frequency {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}