package com.omkar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ComparingTriplets {

    public static void main(String[] args) {

	// write your code here
        int [] a = new int[3];
        int [] b = new int[3];

//        System.out.println(Arrays.toString(compareTriplets(a, b)));
        System.out.println(Arrays.toString(compareTriplets(a, b)));
    }

    public static int [] compareTriplets(int [] a, int [] b) {
        // Write your code here
        Scanner in = new Scanner(System.in);

        int p = 0;
        int q = 0;



        for (int i = 0; i < a.length; i++) 
            a[i] = in.nextInt();
        for (int j = 0; j < b.length; j++) 
            b[j] = in.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i])
                p++;
             else if (a[i] < b[i])
                q++;
        }
        int [] ans = {p,q};
        return ans;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here

        List<Integer> scores = new ArrayList<>();

        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) > b.get(i)) {
                aliceScore += 1;
            }
            else if (a.get(i) < b.get(i)) {
                bobScore += 1;
            }
        }
        scores.add(aliceScore);
        scores.add(bobScore);

        return scores;
    }
}
