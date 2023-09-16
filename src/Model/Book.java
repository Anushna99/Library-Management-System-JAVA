/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
public class Book {
    public String bookId;
    public String bookTitle;
    public String author;
    public int numOfCopies;
    public int numOfAvailableCopies;
    
    public Book(String bookId,String bookTitle,String author,int numOfCopies){
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.author=author;
        this.numOfCopies=numOfCopies;
    }
}
