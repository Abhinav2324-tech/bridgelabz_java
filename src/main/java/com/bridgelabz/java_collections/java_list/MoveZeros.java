package com.bridgelabz.java_collections.java_list;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public static void moveZeros(List<Integer> list){
        int index=0;
        for(int value:list){
            if(value!=0){
                list.set(index,value);
                index++;
            }
        }
        while(index<list.size()){
            list.set(index,0);
            index++;
        }
    }

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(1,0,0,2,7,0,5,6,0,0,8,9));
        moveZeros(list);
        System.out.println(list);
    }
}
