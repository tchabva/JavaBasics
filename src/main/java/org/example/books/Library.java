package org.example.books;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookArrayList = new ArrayList<>();
    ArrayList<Ebook> ebookArrayList = new ArrayList<>();
    ArrayList<GraphicNovel> graphicNovelArrayList = new ArrayList<>();
    ArrayList<SheetMusic> sheetMusicArrayList = new ArrayList<>();

    public ArrayList<String> getBooks() {
        ArrayList<String> bookTitleList = new ArrayList<>();

        for(var book : bookArrayList){
            bookTitleList.add(book.title);
        }

        bookTitleList.addAll(getEbooks());

        bookTitleList.addAll(getGraphicNovels());

        bookTitleList.addAll(getSheetMusic());

        return bookTitleList;
    }
    
    public ArrayList<String> getEbooks() {
        ArrayList<String> ebookTitleList = new ArrayList<>();
        for(var ebook : ebookArrayList){
            ebookTitleList.add(ebook.title);
        }
        return ebookTitleList;
    }

    public ArrayList<String> getGraphicNovels(){
        ArrayList<String> graphicNovelTitleList = new ArrayList<>();
        for(var graphicNovel : graphicNovelArrayList){
            graphicNovelTitleList.add(graphicNovel.title);
        }
        return graphicNovelTitleList;
    }

    public ArrayList<String> getSheetMusic(){
        ArrayList<String> sheetMusicTitleList = new ArrayList<>();
        for(var sheetMusic : sheetMusicArrayList){
            sheetMusicTitleList.add(sheetMusic.title);
        }
        return sheetMusicTitleList;
    }

    //Create a deposit book to Library method.
    public void depositBook(Book book){
        this.bookArrayList.add(book);
        System.out.println("deposited ".concat(book.title));
    }
    
    public void depositBook(Ebook book){
        this.ebookArrayList.add(book);
        System.out.println("deposited ".concat(book.title));
    }

    public void depositBook(GraphicNovel book){
        this.graphicNovelArrayList.add(book);
        System.out.println("deposited ".concat(book.title));
    }

    public void depositBook(SheetMusic book){
        this.sheetMusicArrayList.add(book);
        System.out.println("deposited ".concat(book.title));
    }

    //Create a withdrawBook function from Library method.
    public void withdrawBook(Book book){
        this.bookArrayList.remove(book);
        System.out.println("withdrew ".concat(book.title));
    }
    
    public void withdrawBook(Ebook book){
        this.ebookArrayList.remove(book);
        System.out.println("withdrew ".concat(book.title));
    }

    public void withdrawBook(GraphicNovel book){
        this.graphicNovelArrayList.remove(book);
        System.out.println("withdrew ".concat(book.title));
    }

    public void withdrawBook(SheetMusic book){
        this.sheetMusicArrayList.remove(book);
        System.out.println("withdrew ".concat(book.title));
    }
}

