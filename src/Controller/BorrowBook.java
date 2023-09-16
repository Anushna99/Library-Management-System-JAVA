/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class BorrowBook {
    public void memberBorrowBook(String memberId,String bookId,String borrowedDate,String dueDate){
        try{
            Connection con=DB.createConnection();
            String sql="insert into borrowed_books(memberId,bookId,borrowedDate,dueDate) values('"+memberId+"','"+bookId+"','"+borrowedDate+"','"+dueDate+"')";
            String sql1="update books set numOfAvailableCopies=numOfAvailableCopies-1 where bookId='"+bookId+"'";
            Statement st=con.createStatement();
            
            PreparedStatement statement=con.prepareStatement(sql);
            int i=statement.executeUpdate();
            if(i==1){
                JOptionPane.showMessageDialog(null, "Book Borrowed Successfully", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
                st.executeUpdate(sql1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Book Borrowing Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Member has already borrowed that book", "Error ", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
