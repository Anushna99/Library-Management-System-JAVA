/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Book;
import Model.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddNewBook {
    Book book;
    public AddNewBook(Book book){
        this.book=book;
    }
    public void AddBookToDB(){
        try{
            Connection con=DB.createConnection();
            String sql="insert into books(bookId,bookTitle,author,numOfCopies,numOfAvailableCopies) values('"+book.bookId+"','"+book.bookTitle+"','"+book.author+"','"+book.numOfCopies+"','"+book.numOfCopies+"')";
            
            PreparedStatement statement=con.prepareStatement(sql);
            int i=statement.executeUpdate();
            if(i==1){
                JOptionPane.showMessageDialog(null, "Book Added Successfully", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Book Registration Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
