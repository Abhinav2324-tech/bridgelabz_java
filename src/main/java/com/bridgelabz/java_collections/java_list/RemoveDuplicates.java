package com.bridgelabz.java_collections.java_list;
import java.util.*;
public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer>result=new ArrayList<>();
        for(int values:list){
            if(!result.contains(values)){
                result.add(values);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(3, 1, 2, 2, 3, 4));
        System.out.println(removeDuplicates(list));
    }
}
