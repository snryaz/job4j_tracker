package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic firstWord = new DummyDic();
        String remember = firstWord.engToRus("Reread");
        System.out.println(remember);
    }
}
