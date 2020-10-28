package main.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();
        if (firstNum>=secondNum) System.out.println("Incorrect!");
        else {
            for (int i = firstNum; i<secondNum;i++){
                if(i%5==0 & i%10!=0){
                    System.out.print(i+" ");
                }
            }
        }


    }
}
