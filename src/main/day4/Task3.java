package main.day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int maxSum1 = 0, maxSum2 = 0;
        int count = 0;
        int flag = 0;
        int[][] arr = new int[12][8];


        for (int[] m : arr) {

            for (int n : m) {
                n = new Random().nextInt(50);
                maxSum1 += n;
            }
            count++;

            if (maxSum1 >= maxSum2) {
                maxSum2 = maxSum1;
                flag = count;
            }
            maxSum1 = 0;
        }

        System.out.println("index " + flag);
    }

}

