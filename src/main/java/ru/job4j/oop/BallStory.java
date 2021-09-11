package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.goAway(hare);
        hare.tryEat(ball);
        ball.goAway(wolf);
        wolf.tryEat(ball);
        ball.goAway(fox);
        fox.tryEat(ball);
    }

}
