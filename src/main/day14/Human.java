package main.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Human> parseFileToObjList() {
        List<Human> humanList = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String human = scanner.nextLine();
                String[] people = human.split(" ");
                if(Integer.parseInt(people[1])>=0) {
                    humanList.add(new Human(people[0], Integer.parseInt(people[1])));
                } else {
                    throw new IllegalArgumentException("Некорректные входный данные");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println(humanList);
        return humanList;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
