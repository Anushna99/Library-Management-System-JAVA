/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DB;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class RemoveUser {
    public void RemoveUserFromDB(String username){
        try{
            Connection con=DB.createConnection();
            Statement st=con.createStatement();
            st.executeUpdate("delete from system_users where user_name='"+username+"'");
            con.close();
            }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error"+e.getLocalizedMessage());
            }
    }
}
