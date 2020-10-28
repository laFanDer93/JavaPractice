package main.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int finish = 0;
        while (finish != 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vvedite gorod: ");
            String city = scanner.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Russia");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Italy");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("England");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("German");
                    break;
                case "stop":
                    finish = 1;
                    break;
                default:
                    System.out.println("I don't know!!!");
            }
        }

    }
}
