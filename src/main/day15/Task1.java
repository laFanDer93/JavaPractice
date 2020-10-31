package main.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileRead = new File("shoes.csv");
        File fileWrite = new File("missing_shoes");
        List<Shoes> shoesList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(fileRead);
            while (scanner.hasNextLine()) {
                String[] s = scanner.nextLine().split(";");
                if (Integer.parseInt(s[2]) == 0) {
                    shoesList.add(new Shoes(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2])));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try{
            PrintWriter printWriter = new PrintWriter(fileWrite);
            for(Shoes shoes: shoesList){
                printWriter.println(shoes.getName() + ", " + shoes.getSize() + ", " + shoes.getCount() );
//                System.out.println(shoes.getName() + ", " + shoes.getSize() + ", " + shoes.getCount() );
            }
            printWriter.close();

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

    }

}
