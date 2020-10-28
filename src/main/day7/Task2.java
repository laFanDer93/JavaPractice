package main.day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();

        p4.info();

        for (int i = 0; i < 100; i++) {
            p4.run();
            System.out.println(p4.getStamina());
        }

        p4.info();

    }
}
