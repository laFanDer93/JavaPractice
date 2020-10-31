package main.day8;

public class Airoplane {
    private String producer; //изготовитель
    private int yearOfProduction;
    private int length;
    private int weight;
    private int fuel;

    public Airoplane(String producer, int yearOfProduction, int length, int weight) {
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", " +
                " год выпуска: " + yearOfProduction + ", " +
                " длина: " + length + ", " +
                "вес: " + weight + ", " +
                "количество топлива в баке: " + fuel);
    }

    public int fillUp(int fuel) {
       return this.fuel += fuel;
    }

    public static void compareAirplanes (Airoplane firstPlane, Airoplane secondPlane){
        if(firstPlane.length < secondPlane.length){
            System.out.println("Второй самолёт длинее");
        } else System.out.println("Первый самолёт длинее");
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ", " +
                " год выпуска: " + yearOfProduction + ", " +
                " длина: " + length + ", " +
                "вес: " + weight + ", " +
                "количество топлива в баке: " + fuel;
    }
}
