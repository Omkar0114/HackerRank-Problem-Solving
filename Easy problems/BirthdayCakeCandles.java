package com.omkar;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(1);
        arr.add(4);
        arr.add(3);

        System.out.println(birthdayCakeCandles(arr));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        int max = candles.get(0);

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
            }
        }

        int value = max;

        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == value){
                count++;
            }
        }
        return count;
    }
}
