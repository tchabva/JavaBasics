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
        Ebook ebook1 = new Ebook("The Revolution", 474, FileType.PDF);

        System.out.println(ebook.pages);
        System.out.println(ebook.title);
        System.out.println(ebook.fileType);

        //Creating an instance of library
        Library library = new Library();

        library.depositBook(ebook);

        System.out.println(library.getEbookArrayList().size());

        library.depositBook(ebook1);

        System.out.println(library.getEbookArrayList().size());
        System.out.println(library.getEbookArrayList().getFirst().title);

        library.withdrawBook(ebook);

        System.out.println(library.getEbookArrayList().size());
        System.out.println(library.getEbookArrayList().getFirst().title);
    }
}

