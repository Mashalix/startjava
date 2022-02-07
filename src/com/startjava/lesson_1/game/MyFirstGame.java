package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int computerNumber = 25;
        int userNumber = 15;

        System.out.println("Игра началась!");

        while(userNumber != computerNumber) {
            if(userNumber > computerNumber) {
                System.out.println("Данное число = " + userNumber + " больше того, что загадал компьютер");
                userNumber--;
            } if(userNumber < computerNumber) {
                System.out.println("Данное число = " + userNumber + " меньше того, что загадал компьютер");
                userNumber++;
            }
        }
        System.out.println("Вы угадали!");
        System.out.println("Игра закончилась!");
    }
}