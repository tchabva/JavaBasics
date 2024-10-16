package org.example.books;

public class Book {
    public String title;
    public int pages;
    int currentPage;

    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
        this.currentPage = 1;
    }

    public void turnPage(int pagesTurned){
        if ( (currentPage + pagesTurned) < pages || (currentPage + pagesTurned) >0 ){
            currentPage += pagesTurned;
        } else{
            System.out.println("Invalid page selection");
        }
    }
}

enum FileType{
    MOBI,
    EPUB,
    AZW,
    PDF
}

class Ebook extends Book{
    FileType fileType;
    public Ebook(String title, int pages, FileType fileType) {
        super(title, pages);
        this.fileType = fileType;
    }

    public static Ebook convertToEbook(Book book){

        return new Ebook(book.title, book.pages, FileType.PDF);
    }
}

class GraphicNovel extends Book{
    String illustrator;
    public GraphicNovel(String title, int pages) {
        super(title, pages);
    }
}


class SheetMusic extends Book{
    String composer;
    public SheetMusic(String title, int pages) {
        super(title, pages);
    }
}


