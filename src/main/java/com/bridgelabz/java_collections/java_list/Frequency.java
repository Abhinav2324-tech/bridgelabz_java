package com.bridgelabz.java_collections.java_list;

import java.util.ArrayList;
import java.util.List;

public class Frequency {
    public static void findFrequency(List<Integer> list){
        List<Integer>checked=new ArrayList<>();

        for(int value:list){
            if(!checked.contains(value)){
                int count=0;
                for(int nums:list){
                    if(nums==value){
                        count++;
                    }
                }
                System.out.println(value+"->"+count);
                checked.add(value);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1, 2, 1, 3, 2, 1));
        findFrequency(list);
    }
}
