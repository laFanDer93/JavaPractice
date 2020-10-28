package main.day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int maxSum = 0;
        int flag = 0;

        for (int m = 0; m < arr.length; m++) {
            arr[m] = new Random().nextInt(1000);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 2; i++) {
            sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                flag = i;
            }
        }
        System.out.println("maxSum " + maxSum + "\n"
                + "index " + flag);
    }
}
