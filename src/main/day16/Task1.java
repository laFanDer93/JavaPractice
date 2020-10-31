package main.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("File");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            double result = 0;
            Scanner scanner = new Scanner(file);
            String[] arr = scanner.nextLine().split(",");
            for (String s : arr) {
                result += (double) Integer.parseInt(s);
            }
            System.out.print(result/arr.length+" --> ");
            System.out.printf("%.3f", (result/ arr.length));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
