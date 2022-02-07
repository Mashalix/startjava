package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(scan.next());

        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
    
        do {
            if("yes" .equals(answer)) {
                game.startGame();
            }
            System.out.println("Хотите продолжить, yes/no?");
            answer = scan.next();
        } while(!"no" .equals(answer));
    }
}