package com.omkar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AveryBigSum {
    public static void main(String[] args) {

        List<Long> arr = new ArrayList<>();

        arr.add(1000000001L);
        arr.add(1000000002L);
        arr.add(1000000003L);
        arr.add(1000000004L);
        arr.add(1000000005L);
        System.out.println(aVeryBigSum(arr));
    }

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum =0;


        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}
