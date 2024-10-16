package org.example.books;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookArrayList = new ArrayList<>();
    ArrayList<Ebook> ebookArrayList = new ArrayList<>();
    ArrayList<GraphicNovel> graphicNovelArrayList = new ArrayList<>();
    ArrayList<SheetMusic> sheetMusicArrayList = new ArrayList<>();

    public ArrayList<Book> getBooks() {
        return bookArrayList;
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

    public ArrayList<SheetMusic> getSheetMusicArrayList(){
        return sheetMusicArrayList;
    }

    //Create a deposit book to Library method.
    public void depositBook(Book book){
        this.bookArrayList.add(book);
    }
    
    public void depositBook(Ebook book){
        this.ebookArrayList.add(book);
    }

    public void depositBook(GraphicNovel book){
        this.graphicNovelArrayList.add(book);
    }

    public void depositBook(SheetMusic book){
        this.sheetMusicArrayList.add(book);
    }

    //Create a withdrawBook function from Library method.
    public void withdrawBook(Book book){
        this.bookArrayList.remove(book);
    }
    
    public void withdrawBook(Ebook book){
        this.ebookArrayList.remove(book);
    }

    public void withdrawBook(GraphicNovel book){
        this.graphicNovelArrayList.remove(book);
    }

    public void withdrawBook(SheetMusic book){
        this.sheetMusicArrayList.remove(book);
    }
}

