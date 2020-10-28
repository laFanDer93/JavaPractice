package main.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
      while(true){
          meth1();
      }

    }

    public static void meth1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number is ");
        int count =  + scanner.nextInt();
        if (count<5 && count>0) System.out.println("Малоэтажный дом");
        else if (count>4 && count<9) System.out.println("Среднеэтажный дом");
        else if (count>8) System.out.println("Многоэтажный дом");
        else System.out.println("Такого не существует!");
    }

}


