package ru.job4j.pojo;

import java.util.Collections;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("book", 10);
        books[1] = new Book("book1", 15);
        books[2] = new Book("book2", 52);
        books[3] = new Book("Clean code", 56);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book book: books) {
            if (book.getTitle().equals("Clean code")) {
                System.out.println(book);
            }
        }
    }
}
