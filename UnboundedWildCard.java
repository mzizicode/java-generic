package com.wizard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnboundedWildCard {
    public static void main(String[] args) {
    List<Object>list=new ArrayList<>();
    list.add(new Date());
    list.add(1,2);
    List<Integer>list1=new ArrayList<>();
    list1.add(1);
    List<String>list2=new ArrayList<>();
    list.add("peter");
    print(list);
    print(list1);
    print(list2);

    }
    //the ? is the unbounded wild list allowing
    // you to print more than one datatype
    static void print(List<?> list){
        list.forEach(System.out::println);


    }
}
