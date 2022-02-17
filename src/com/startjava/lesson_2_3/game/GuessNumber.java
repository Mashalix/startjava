package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random rnd = new Random();
        int playerNum = rnd.nextInt(100 + 1);
        Scanner console = new Scanner(System.in);

        while(true) { 
            System.out.print(player1.getName() + ", введите число: ");
            int num = console.nextInt();
            if(num == playerNum) {
                System.out.println("Победил игрок " + player1.getName());
                break;
            } else if(num > playerNum) {
                System.out.println("Введенное число больше загаданного");
            } else {
                System.out.println("Введенное число меньше загаданного");
            }

            System.out.print(player2.getName() + ", введите число: ");
            num = console.nextInt();
            if(num == playerNum) {
                System.out.println("Победил игрок " + player2.getName());
                break;
            } else if(num > playerNum) {
                System.out.println("Введенное число больше загаданного");
            } else {
                System.out.println("Введенное число меньше загаданного");
            }
        }
    }
}