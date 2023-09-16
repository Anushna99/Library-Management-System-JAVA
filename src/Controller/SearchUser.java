/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class SearchUser {
    /*User user;
    public SearchUser(User user){
        this.user=user;
    }*/
    
    public void SearchUsername(String username,DefaultTableModel tblModel){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select * from system_users where user_name like'%"+username+"%'";
            ResultSet rst=st.executeQuery(sql);
            
            while(rst.next()){
             String username1=rst.getString("user_name");
             String userType=rst.getString("user_type");
             
             String tblData[]={username1,userType};
             tblModel.addRow(tblData);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
