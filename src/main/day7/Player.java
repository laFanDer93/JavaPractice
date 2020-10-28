package main.day7;

import java.util.Random;

public class Player {
    int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player() {
        this.stamina = new Random().nextInt(10)+90;
        countPlayers++;
        if (countPlayers>6){
            countPlayers=6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        this.stamina--;
        if (this.getStamina() == 0) {
            countPlayers--;
        }
        if(getStamina()<0){
            this.stamina = 0;
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле есть еще "
                    + (6 - countPlayers) + " свободных мест ");

        } if(countPlayers==6){
            System.out.println("На поле нет свободных мест");
        }
    }

}
