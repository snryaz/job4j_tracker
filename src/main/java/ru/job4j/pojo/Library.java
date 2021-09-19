package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 500);
        Book houndBaskervilles = new Book("The Hound of the Baskervilles", 205);
        Book robinsonCrusoe = new Book("Robinson Crusoe", 230);
        Book alice = new Book("Alice's Adventures in Wonderland", 416);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = houndBaskervilles;
        books[2] = robinsonCrusoe;
        books[3] = alice;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName() + " - " + bks.getPages());
        }
        System.out.println("\nChanges first book on fourth book");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName() + " - " + bks.getPages());
        }
        System.out.println("\nPrint book info if book name \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            if (bks.getName().equals("Clean code")) {
                System.out.println(bks.getName() + " - " + bks.getPages());
            }
        }
    }
}
