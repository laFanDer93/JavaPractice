package main.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("File");
        try {
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int sum = 0;
        String[] fileNumInStr = scanner.nextLine().split(",");

        if (fileNumInStr.length != 10) {
            throw new IllegalArgumentException();
        }

        for (String num : fileNumInStr) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum + " - Сумма чисел из считанного файла");
    }
}
