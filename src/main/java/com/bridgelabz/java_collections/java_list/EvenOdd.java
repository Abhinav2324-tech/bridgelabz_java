package com.bridgelabz.java_collections.java_list;
import java.util.*;

public class EvenOdd {
    public static void evenOdd(List<Integer>list){
        List<Integer>even=new ArrayList<>();
        List<Integer>odd=new ArrayList<>();

        for(int value:list){
            if(value%2==0){
                even.add(value);
            }
            else{
                odd.add(value);
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,3,62,7,8,9,4,86));
        evenOdd(list);
    }
}
