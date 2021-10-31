package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private int countEngine = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountEngine(int countEngine) {
        this.countEngine = countEngine;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }
}
