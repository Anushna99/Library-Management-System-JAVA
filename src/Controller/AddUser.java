/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddUser {
    User user;
    public AddUser(User user){
        this.user=user;
    }
    public void addUserToDB(){
        try{
            Connection con=DB.createConnection();
            String sql="insert into system_users(user_name,password,user_type,mail_address) values('"+user.userName+"','"+user.password+"','"+user.userType+"','"+user.mailAddress+"')";
            
            PreparedStatement statement=con.prepareStatement(sql);
            int i=statement.executeUpdate();
            if(i==1){
                JOptionPane.showMessageDialog(null, "User Added Successfully", "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "User Registration Failed..Try Again..", "InfoBox: ", JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
