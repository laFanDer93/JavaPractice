package main.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);
    }

    public static List<String> parseFileToStringList(File file)  {
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                people.add(line);
                String[] human = line.split(" ");
                if(Integer.parseInt(human[1]) <0){
                    throw new IllegalArgumentException();
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

        return people;
    }



}
