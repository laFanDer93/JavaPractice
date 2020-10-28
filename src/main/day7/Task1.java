package main.day7;

public class Task1 {
    public static void main(String[] args) {
        Airoplane t134 = new Airoplane("Russia",2010,130,12000);
        Airoplane t144 = new Airoplane("USA",2030,50,22000);
        Airoplane.compareAirplanes(t134,t144);

    }
}