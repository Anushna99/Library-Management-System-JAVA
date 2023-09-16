/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import Model.User;
import View.LoginWindow;
import View.MainWindow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserLogin {
    User user;
    public UserLogin(User user){
        this.user=user;
    }
    public void userLoginToSystem(String userName,String password,LoginWindow loginWindow){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            String sql="select count(*) from system_users where user_name='"+userName+"'";
            ResultSet rst=st.executeQuery(sql);
            int count=0;
            while(rst.next()){
             count=rst.getInt(1);
            }
            if(count==1){
                sql="select password from system_users where user_name='"+userName+"'";
                ResultSet rst1=st.executeQuery(sql);
                String pwd=null;
                while(rst1.next()){
                    pwd=rst1.getString("password");
                }
                if(pwd.equals(password)){
                //JOptionPane.showMessageDialog(null, "Login Successful", "InfoBox: " + "Login", JOptionPane.INFORMATION_MESSAGE);
                sql="select user_type from system_users where user_name='"+userName+"'";
                ResultSet rst2=st.executeQuery(sql);
                String userType="";
                while(rst2.next()){
                    userType=rst2.getString("user_type");
                }
                if(userType.equals("Admin")){
                    User.isAdmin=true;
                }
                
                    loginWindow.dispose();
                    MainWindow mainWindow=new MainWindow();
                    mainWindow.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login Failed, Incorrect password ", "InfoBox: " + "Login", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Login Failed Invalid Username", "InfoBox: " + "Login", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
