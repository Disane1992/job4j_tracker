package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ono = new Book("Ono", 200);
        Book newLife = new Book("New life", 100);
        Book love = new Book("Love", 150);
        Book kapital = new Book("Kapital", 220);
        Book[] books = new Book[4];
        books[0] = ono;
        books[1] = newLife;
        books[2] = love;
        books[3] = kapital;
        Book cleanCode = new Book("Clean code", 300);
        books[0] = cleanCode;
        for (int i = 0; i < 4; i++) {
            System.out.println(books[i].name + "_" + books[i].pages);
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < 4; i++) {
            System.out.println(books[i].name + "_" + books[i].pages);
        }
        for (int i = 0; i < 4; i++) {
            if (books[i].name.equals("Clean code")) {
                System.out.println(books[i].name + "_" + books[i].pages);
            }
        }
    }
}
