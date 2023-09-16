/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SearchBook {
    public void searchForBook(String bookTitle,DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from books where bookTitle like'%"+bookTitle+"%'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String bookId=rst.getString("bookId");
             String bookTitle1=rst.getString("bookTitle");
             String author=rst.getString("author");
             String numberOfCopies=rst.getString("numOfCopies");
             String numberOfAvailableCopies=rst.getString("numOfAvailableCopies");
             
             String tblData[]={bookId,bookTitle1,author,numberOfCopies,numberOfAvailableCopies};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
