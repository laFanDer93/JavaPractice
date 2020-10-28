package main.day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Delimoe ");
            double delimoe = scanner.nextDouble();
            System.out.print("Delitel ");

            double delitel = scanner.nextDouble();
            if (delitel == 0) {
                break;
            }
            System.out.println((double) (delimoe / delitel));

        }
    }
}
