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
public class SearchMember {
    public void searchMemberById(String memberId,DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from members where memberId='"+memberId+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId1=rst.getString("memberId");
             String firstName=rst.getString("firstName");
             String lastName=rst.getString("lastName");
             String address=rst.getString("address");
             String DOB=rst.getString("DOB");
             String gender=rst.getString("gender");
             String tpNumber=rst.getString("tpNumber");
             
             String tblData[]={memberId1,firstName,lastName,address,DOB,gender,tpNumber};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    
    public void searchMemberById1(String memberId,DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from members where memberId='"+memberId+"'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId1=rst.getString("memberId");
             String firstName=rst.getString("firstName");
             String lastName=rst.getString("lastName");
             
             String tblData[]={memberId1,firstName,lastName};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
    
    public void searchMemberByName(String name,DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from members where firstName like'%"+name+"%' or lastName like'%"+name+"%'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String memberId1=rst.getString("memberId");
             String firstName=rst.getString("firstName");
             String lastName=rst.getString("lastName");
             String address=rst.getString("address");
             String DOB=rst.getString("DOB");
             String gender=rst.getString("gender");
             String tpNumber=rst.getString("tpNumber");
             
             String tblData[]={memberId1,firstName,lastName,address,DOB,gender,tpNumber};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
