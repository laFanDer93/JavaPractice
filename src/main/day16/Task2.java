package main.day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("text1");
        try {
            file1.createNewFile();
            FileWriter fileWriter = new FileWriter(file1);
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append(new Random().nextInt(100));
                if (i != 999) {
                    stringBuilder.append(",");
                }

            }
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File is already exist");
        }

        File file2 = new File("text2");
        List<Double> doubleList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file1);
            file2.createNewFile();
            FileWriter fileWriter2 = new FileWriter(file2);
            String[] scan = scanner.nextLine().split(",");
            double twentyElem = 0;
            for (int i = 0; i < scan.length; i++) {
                if (i % 20 != 0) {
                    twentyElem += Integer.parseInt(scan[i]);
                } else if (i!= 0) {
                    doubleList.add((double) twentyElem / 20);
                    twentyElem=0;
                }
            }

            fileWriter2.write(doubleList.toString());
            fileWriter2.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not founnd");
        } catch (IOException e){
            System.out.println("File not founnd");

        }
    }
}
