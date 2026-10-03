package com.bridgelabz.java_collections.java_list;
import java.util.*;

public class RotateList {
public static void rotateList(List<Integer>list,int k){
    for(int i=0;i<k;i++){
        int first=list.remove(0);
        list.add(first);
    }
}

    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(10, 20, 30, 40, 50));
        rotateList(list,2);
        System.out.println(list);
    }
}
