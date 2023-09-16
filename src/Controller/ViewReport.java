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
public class ViewReport {
    public void viewAllBorrowedBooks(DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String bookId=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId,bookId,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    public void viewOnlyNotReturnedBooks(DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books where isReturned='"+"No"+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String bookId=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId,bookId,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    public void searchRecordsByMemberId(DefaultTableModel tblModel,String memberId){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books where memberId='"+memberId+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId1=rst.getString("memberId");
             String bookId=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId1,bookId,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    public void searchRecordsByMemberId1(DefaultTableModel tblModel,String memberId){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books where memberId='"+memberId+"' and isReturned='"+"No"+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId1=rst.getString("memberId");
             String bookId=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId1,bookId,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    public void searchRecordsByBookId(DefaultTableModel tblModel,String bookId){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books where bookId='"+bookId+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String bookId1=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId,bookId1,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    
    public void searchRecordsByBookId1(DefaultTableModel tblModel,String bookId){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from borrowed_books where bookId='"+bookId+"' and isReturned='"+"No"+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId=rst.getString("memberId");
             String bookId1=rst.getString("bookId");
             String borrowedDate=rst.getString("borrowedDate");
             String dueDate=rst.getString("dueDate");
             String isReturned=rst.getString("isReturned");
             
             String tblData[]={memberId,bookId1,borrowedDate,dueDate,isReturned};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
