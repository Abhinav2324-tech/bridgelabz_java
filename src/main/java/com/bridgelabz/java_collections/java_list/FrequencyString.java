package com.bridgelabz.java_collections.java_list;

import java.util.*;

public class FrequencyString {
    public static Map<String,Integer> findFrequency(List<String> list){
        Map<String,Integer>map=new LinkedHashMap<>();

        for(String value:list){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }
            else {
                map.put(value,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        List<String>list=new ArrayList<>(List.of("apple", "banana", "apple", "orange"));
        System.out.println(findFrequency(list));
    }
}
