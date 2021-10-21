package com.wizard;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
    public static void main(String[] args) {

        List<Integer>list1=new ArrayList<>();
        list1.add(1);
        List<Number>list2=new ArrayList<>();
        list2.add(1);

        PrintNumber(list1);
        PrintNumber(list2);


    }
    //lower bounded wildcard works
    // when u become specific on which datatype you want to use
    //datatype number is general.
    // In This case you might want to be specific on the datatype.
    // That why we use super then the specific datatype
    static void PrintNumber(List<? super Integer>list){
        list.forEach(System.out::println);
    }
}


