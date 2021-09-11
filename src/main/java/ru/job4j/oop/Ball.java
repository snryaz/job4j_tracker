package ru.job4j.oop;

public class Ball {
    public void goAway(Hare hare) {
        System.out.println("Ball try go away from hare: " + true);
    }

    public void goAway(Wolf wolf) {
        System.out.println("Ball try go away from wolf: " + true);
    }

    public void goAway(Fox fox) {
        System.out.println("Ball try go away from fox: " + false);
    }
}
