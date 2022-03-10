package com.omkar;

import java.util.List;

public class DiagonalDiff {
    public static void main(String[] args) {


    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
//
//        int leftDiagonal = 0;
//        int rightDiagonal = 0;
        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }
}
