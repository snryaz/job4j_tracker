package ru.job4j.oop;

import java.util.Arrays;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error firstError = new Error();
        Error secondError = new Error(true, 5, "unknown command");
        Error thirdError = new Error(true, 1, "connection failure");
        Error fourthError = new Error(false, 3, "invalid value");
        firstError.printInfo();
        secondError.printInfo();
        thirdError.printInfo();
        fourthError.printInfo();
    }
}
