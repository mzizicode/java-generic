package com.wizard;

public class BoundedTypeParameter {
    public static void main(String[] args) {

        //Example of BoundedTypeParameter with Whole numbers (Integer)
        Integer[]numbers={1,2,3,4};
        System.out.println(CountGreaterThan(numbers,2));
        //Example of BoundedTypeParameter with decimals(double)
        Double[] numbers1={0.1,0.2,0.3,0.4};
        System.out.println(CountGreaterThan(numbers1,0.1));

    }
    static <T extends Comparable<T>>int CountGreaterThan(T[]numbers,T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }

        }
        return count;
    }





















