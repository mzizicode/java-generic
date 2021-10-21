package com.wizard;

public class Method {
    public static void main(String[] args) {
      String[]names={"peter","mike"};
      Integer[]number={1,3,4};
      Character[]ch={'A','B','C'};
      print(names);
      print(number);
      print(ch);

    }
    static<T> void print(T [] names){
        for (T name:names) {
            System.out.println(name);
        }


    }

}


