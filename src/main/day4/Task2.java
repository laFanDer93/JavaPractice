package main.day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int minNum = 1000;
        int maxNum = 0;
        int zeroNum = 0;
        int sumZeroNum = 0;

        int[] arr = new int[100];
        arr = Arrays.stream(arr).map((e) -> e = new Random().nextInt(1000)).toArray();
        System.out.println(Arrays.toString(arr));

        for (int res : arr) {
            if (minNum > res) {
                minNum = res;
            }
            if (maxNum < res) {
                maxNum = res;
            }
            if (res % 10 == 0) {
                zeroNum++;
                sumZeroNum += res;
            }
        }
        System.out.println("наибольший элемент массива " + maxNum + "\n" +
                "- наименьший элемент массива " + minNum + "\n" +
                "- количество элементов массива, оканчивающихся на 0 " + zeroNum + "\n" +
                "- сумму элементов массива, оканчивающихся на 0 " + sumZeroNum);
    }
}
