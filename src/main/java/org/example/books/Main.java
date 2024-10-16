package org.example.books;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 500);

        System.out.println(book.currentPage);
        System.out.println(book.title);

        book.turnPage(344);

        System.out.println(book.currentPage);
        System.out.println(book.title);

        Ebook ebook = new Ebook("The Hobbit", 800, FileType.EPUB);

        System.out.println(ebook.pages);
        System.out.println(ebook.title);
        System.out.println(ebook.fileType);


    }
}

