package main.day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int taskB = 0;
        int taskC = 0;
        int taskD = 0;
        int taskE = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter mass.length: ");
        int massLength = scanner.nextInt();

        int[] arr = new int[massLength];
        Random random = new Random();
        for (int i = 0; i < massLength; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int e1 : arr) {
            if (e1 > 8) {
                taskB += 1;
            }
            if (e1 == 1) {
                taskC += 1;
            }
            if (e1 % 2 == 0) {
                taskD += 1;
            } else taskE += 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количестве чисел больше 8  = " + taskB);
        System.out.println("Количестве чисел равных 1  = " + taskC);
        System.out.println("Количестве четных чисел    = " + taskD);
        System.out.println("Количестве нечетных чисел  = " + taskE);


        //Task A
        System.out.println("Длина массива = " + massLength);
        //Task E
        System.out.println("Суммa всех элементов массива = " +
                Arrays.stream(arr)
                        .reduce((accum, element) -> accum + element)
                        .getAsInt());
    }

}
