package com.omkar;

public class StairCase {
    public static void main(String[] args) {

        staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here

        for (int i = 1; i <=n; i++) {
            // inner loop for space printing:
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
