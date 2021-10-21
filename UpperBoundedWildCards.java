package com.wizard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildCards {
    public static void main(String[] args) {
        List<Double>list=new ArrayList<>();

        list.add(1.2);
        List<Integer>list1=new ArrayList<>();
        list1.add(1);
        List<Number>list2=new ArrayList<>();
        list2.add(1);
        PrintNumber(list);
        PrintNumber(list1);
        PrintNumber(list2);


    }
    //upper bounded wildcard works when u extend the list to work with any datatype
    static void PrintNumber(List<? extends Number>list){
        list.forEach(System.out::println);
    }
}
