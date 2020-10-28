package main.day6;

public class Task2 {
    public static void main(String[] args) {
        Airoplane t134 = new Airoplane("Russia",2010,130,12000);
        t134.info();

        t134.setYearOfProduction(2012);
        t134.setLength(220);

        t134.fillUp(20);
        t134.fillUp(459);

        t134.info();
    }
}
