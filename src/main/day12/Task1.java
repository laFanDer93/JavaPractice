package main.day12;
//1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
//консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
//из списка. Распечатать список.
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carModel = new ArrayList<>();
        carModel.add("Ferrari");
        carModel.add("BMW");
        carModel.add("Mercedes-benz");
        carModel.add("Audi");
        carModel.add("LADA");
        System.out.println(carModel);

        carModel.remove(0);
        System.out.println(carModel);

        carModel.add(carModel.size() / 2, "KIA");
        System.out.println(carModel);

    }
}
