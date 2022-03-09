package com.omkar;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);


    }

     static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positive = 0;
        float negative = 0;
        float zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0){
                positive++;
            }else if (arr.get(i) < 0) {
                negative++;
            }else if (arr.get(i) == 0){
                zero++;
            }
        }
        float a = positive / arr.size();
        float b = negative / arr.size();
        float c = zero / arr.size();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
