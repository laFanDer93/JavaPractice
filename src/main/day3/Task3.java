package main.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (i<5) {
            System.out.print("Delimoe ");
            double delimoe = scanner.nextDouble();
            System.out.print("Delitel ");
            double delitel = scanner.nextDouble();
            if (delitel == 0) {
                System.out.println("---------Delenie na 0");
                i++;
                continue;
            }
            i++;
            System.out.println((double) (delimoe / delitel));

        }

    }
}
