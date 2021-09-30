package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            boolean trueCount = matches >= 1 && matches <= 3;
            if (trueCount) {
                boolean trueMatches = count - matches >= 0;
                if (trueMatches) {
                    turn = !turn;
                    count -= matches;
                    System.out.println(count);
                } else {
                    System.out.println("Количество оставишихся спичек меньше, чем вы хотите взять");
                }
            } else {
                System.out.println("Количество спичек должно быть от 1 до 3");
            }
        }
        if ((!turn)) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
