package main.day12;

//2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
//Вывести список.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0 ; i<=350;i+=2){
            integerList.add(i);
            if (i==30) i=298;
        }
        System.out.println(integerList);
    }

}
