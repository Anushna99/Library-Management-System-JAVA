/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ReturnBook {
    public void returnBookToLibrary(String memberId,String bookId){
        try{
            Connection con=DB.createConnection();
            String sql="update borrowed_books set isReturned='"+"Yes"+"' where memberId='"+memberId+"' and bookId='"+bookId+"'";
            String sql1="update books set numOfAvailableCopies=numOfAvailableCopies+1 where bookId='"+bookId+"'";
            
            PreparedStatement statement=con.prepareStatement(sql);
            PreparedStatement statement1=con.prepareStatement(sql1);
            int i=statement.executeUpdate();
            int j=statement1.executeUpdate();
            if(i==1 && j==1){
                JOptionPane.showMessageDialog(null, "Book Returned Successfully", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Book Returning Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    
    public long calDays(String memberId,String bookId){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select dueDate from borrowed_books where memberId='"+memberId+"' and bookId='"+bookId+"'";
            ResultSet rst=st.executeQuery(sql);
            long numberOfDays=0;
            while(rst.next()){
             numberOfDays=ChronoUnit.DAYS.between(LocalDate.parse(rst.getString("dueDate")),LocalDate.now());
            }
            con.close();
            if(numberOfDays<0){
                return 0;
            }else{
            return numberOfDays;
            }
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
            return 0;
        }
    }
}
